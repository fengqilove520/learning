package top.fqq.rocketmqconsumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerOrderly;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;


@Slf4j
@RestController
@RequestMapping("rocketmq")
public class RocketMQController {

    @Value("${rocketmq.name-server}")
    private String nameServer;

    /**
     * 接收消息
     * @param count
     * @return
     */
    @PostMapping("receive")
    public Boolean receive(@RequestBody String count) throws  Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("my-group");
        consumer.setNamesrvAddr(nameServer);
        /**
         * 设置Consumer第一次启动是从队列头部开始消费还是队列尾部开始消费<br>
         * 如果非第一次启动，那么按照上次消费的位置继续消费
         */
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        consumer.subscribe("common-group", "*");
        consumer.setPullBatchSize(10);
        consumer.registerMessageListener(new MessageListenerOrderly() {
            @Override
            public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs, ConsumeOrderlyContext context) {
                // 设置自动提交
                context.setAutoCommit(true);
                for (MessageExt msg : msgs) {
                    log.info( "消费内容1：{}" , new String(msg.getBody()));
                }

                return ConsumeOrderlyStatus.SUCCESS;
            }
        });

        consumer.start();
        return true;
    }

    /**
     * 接收消息
     * @param count
     * @return
     */
    @PostMapping("receive1")
    public Boolean receive1(@RequestBody String count) throws  Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("my-group");
        consumer.setNamesrvAddr(nameServer);
        /**
         * 设置Consumer第一次启动是从队列头部开始消费还是队列尾部开始消费<br>
         * 如果非第一次启动，那么按照上次消费的位置继续消费
         */
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        consumer.subscribe("common-group", "*");
        consumer.setPullBatchSize(10);
        consumer.registerMessageListener(new MessageListenerOrderly() {
            @Override
            public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs, ConsumeOrderlyContext context) {
                // 设置自动提交
                context.setAutoCommit(true);
                for (MessageExt msg : msgs) {
                    log.info( "消费内容2：{}" , new String(msg.getBody()));
                }

                return ConsumeOrderlyStatus.SUCCESS;
            }
        });

        consumer.start();
        return true;
    }

}

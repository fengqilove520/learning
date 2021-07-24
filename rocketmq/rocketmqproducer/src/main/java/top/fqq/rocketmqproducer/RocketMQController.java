package top.fqq.rocketmqproducer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.MessageQueueSelector;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("rocketmq")
public class RocketMQController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 发送消息
     * @param count
     * @return
     */
    @PostMapping("send")
    public Boolean send(@RequestBody Integer count){
        for(int i=0;i<count;i++) {
            Message msg = new Message("test-topic-1", "order_1", "KEY" + i, ("order_1 " + i).getBytes());
            SendResult sendResult = null;
            try {
                sendResult = rocketMQTemplate.getProducer().send(msg, new MessageQueueSelector() {
                    @Override
                    public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
                        Integer id = (Integer) arg;
                        int index = id % mqs.size();
                        return mqs.get(index);
                    }
                }, 0);
                log.info(sendResult.toString());
            } catch (Exception e) {
                log.info(e.getMessage(),e);
            }
        }
        return true;
    }

}

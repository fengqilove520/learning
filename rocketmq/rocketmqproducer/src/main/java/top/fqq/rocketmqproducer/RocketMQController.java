package top.fqq.rocketmqproducer;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("rocketmq")
public class RocketMQController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 发送消息
     * @param context
     * @return
     */
    @PostMapping("send")
    public Boolean send(@RequestBody String context){
        for(int i=0;i<1000;i++) {
            rocketMQTemplate.send("test-topic-1", MessageBuilder.withPayload(context+"{"+i+"}").build());
        }
        return true;
    }

}

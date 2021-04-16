package top.fqq.rocketmqconsumer;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RocketMqConsumerApplication {



    public static void main(String[] args) {
        SpringApplication.run(RocketMqConsumerApplication.class, args);
    }




}

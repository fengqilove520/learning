package top.fqq.transactionaldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.fqq.transactionaldemo.dao")
public class TransactionaldemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransactionaldemoApplication.class, args);
    }

}

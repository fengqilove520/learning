package top.fqq.designmode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import top.fqq.designmode.decorator.Circle;
import top.fqq.designmode.decorator.Rectangle;
import top.fqq.designmode.decorator.RedShapeDecorator;
import top.fqq.designmode.decorator.Shape;
import top.fqq.designmode.decorator.ShapeDecorator;
import top.fqq.designmode.strategy.MemberStrategy;
import top.fqq.designmode.strategy.MemberStrategyEnum;
import top.fqq.designmode.strategy.Price;

@Slf4j
@SpringBootApplication
public class DesignModeApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext=SpringApplication.run(DesignModeApplication.class, args);
//        //==============================================策略模式==========================================
//        String enMame= MemberStrategyEnum.getenName(1);
//        //根据会员类型创建需要使用的策略对象
//        MemberStrategy strategy = (MemberStrategy)applicationContext.getBean(enMame+"MemberStrategy");
//        //创建环境
//        Price price = new Price(strategy);
//        //计算价格
//        double quote = price.quote(300);
//        System.out.println("图书的最终价格为：" + quote);
        //=============================================装饰器模式==========================================
        Circle circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        log.info("--------------");
        circle.draw();
        log.info("--------------");
        redCircle.draw();
        log.info("--------------");
        redRectangle.draw();
    }

}

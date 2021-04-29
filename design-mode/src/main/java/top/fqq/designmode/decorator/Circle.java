package top.fqq.designmode.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/4/16 10:44
 */
@Slf4j
public class Circle implements Shape {
    @Override
    public void draw() {
        //画圆圈
        log.info("Shape: Circle");
    }
}

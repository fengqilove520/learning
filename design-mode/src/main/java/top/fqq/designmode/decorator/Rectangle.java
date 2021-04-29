package top.fqq.designmode.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/4/16 10:43
 */
@Slf4j
public class Rectangle implements Shape {
    @Override
    public void draw() {
        //画矩形
        log.info("Shape: Rectangle");
    }
}

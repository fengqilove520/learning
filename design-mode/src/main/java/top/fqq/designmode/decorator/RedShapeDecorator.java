package top.fqq.designmode.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/4/16 10:48
 */
@Slf4j
public class RedShapeDecorator extends ShapeDecorator  {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        //画形状
        decoratedShape.draw();
        //设置红色边框
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        log.info("Border Color: Red");
    }
}

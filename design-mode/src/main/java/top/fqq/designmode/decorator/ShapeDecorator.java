package top.fqq.designmode.decorator;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/4/16 10:45
 */
public abstract class ShapeDecorator implements Shape  {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        //画形状
        decoratedShape.draw();
    }
}

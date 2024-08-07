package demo.pattern.decorator.v1;

/**
 * 抽象装饰类
 *
 * @author libiao
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
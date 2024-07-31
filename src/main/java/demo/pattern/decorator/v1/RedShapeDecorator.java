package demo.pattern.decorator.v1;

/**
 * 实体装饰类
 *
 * @author libiao
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape) {
        System.out.println("Border Color: Red");
    }
}
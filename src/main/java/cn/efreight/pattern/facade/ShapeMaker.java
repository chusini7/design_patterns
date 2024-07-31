package cn.efreight.pattern.facade;

/**
 * @author libiao
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void draw() {
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
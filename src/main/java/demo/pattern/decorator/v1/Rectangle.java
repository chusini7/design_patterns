package demo.pattern.decorator.v1;

/**
 * 画矩形
 *
 * @author libiao
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
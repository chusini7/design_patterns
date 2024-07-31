package demo.pattern.decorator.v1;

/**
 * 画圈
 *
 * @author libiao
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
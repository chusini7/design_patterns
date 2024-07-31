package demo.pattern.facade;

/**
 * @author libiao
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
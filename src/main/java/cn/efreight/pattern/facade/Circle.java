package cn.efreight.pattern.facade;

/**
 * @author libiao
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
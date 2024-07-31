package cn.efreight.pattern.facade;

/**
 * @author libiao
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
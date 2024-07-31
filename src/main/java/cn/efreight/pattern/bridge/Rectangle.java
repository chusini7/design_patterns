package cn.efreight.pattern.bridge;

/**
 * @author libiao
 */
public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.print("我是长方形·");
        colorApi.paint();
    }
}

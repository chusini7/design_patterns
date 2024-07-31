package cn.efreight.pattern.bridge;

/**
 * @author libiao
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.print("我是圆形·");
        colorApi.paint();
    }
}

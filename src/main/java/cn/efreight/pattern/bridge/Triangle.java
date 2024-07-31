package cn.efreight.pattern.bridge;

/**
 * @author libiao
 */
public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.print("我是三角形·");
        colorApi.paint();
    }
}

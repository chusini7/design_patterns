package cn.efreight.pattern.flyweight;

import lombok.Setter;

/**
 * @author libiao
 */
public class Circle implements Shape {

    private String color;

    @Setter
    private int x;

    @Setter
    private int y;

    @Setter
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
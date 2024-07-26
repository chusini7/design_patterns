package cn.efreight.pattern.proxy.dynamic.jdk;

/**
 * @author libiao
 */
public class RealImage implements Image {

    @Override
    public void display() {
        System.out.println("image displaying...");
    }

}
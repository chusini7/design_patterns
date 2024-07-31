package demo.pattern.bridge;

/**
 * 桥接模式
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        //创建一个圆形
        Shape shape = new Circle();
        //给圆形蓝色的颜料
        shape.setDrawApi(new BlueColorApi());
        //上色
        shape.draw();

        //创建一个长方形
        Shape shape1 = new Rectangle();
        //给长方形红色的颜料
        shape1.setDrawApi(new RedColorApi());
        //上色
        shape1.draw();

        // 新增形状和颜色
        Shape shape2 = new Triangle();
        shape2.setDrawApi(new GreenColorAPI());
        shape2.draw();
    }
}


package demo.pattern.prototype;

/**
 * 原型模式
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedCircle = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedCircle.getType());

        Shape clonedSquare = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedSquare.getType());

        Shape clonedRectangle = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedRectangle.getType());
    }
}
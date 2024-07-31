package demo.pattern.composite.v1;

/**
 * 组合模式测试类
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        Component composite = new Composite();
        composite.addComposite(new Leaf("A"));
        composite.addComposite(new Leaf("B"));
        composite.addComposite(new Leaf("C"));

        Composite composite2 = new Composite();
        composite2.addComposite(new Leaf("D"));
        composite2.addComposite(new Leaf("E"));

        composite.addComposite(composite2);

        composite.operation();
    }
}

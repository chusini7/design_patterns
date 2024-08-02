package demo.pattern.visitor;

/**
 * 具体访问者（Concrete Visitor）：实现访问者接口，提供对每个具体元素类的访问和相应操作。
 *
 * @author libiao
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
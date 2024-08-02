package demo.pattern.visitor;

/**
 * 具体元素（Concrete Element）：实现元素接口，提供一个accept方法，允许访问者访问并操作。
 *
 * @author libiao
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
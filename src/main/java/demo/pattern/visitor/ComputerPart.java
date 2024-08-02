package demo.pattern.visitor;

/**
 * 元素（Element）：定义了一个接受访问者的方法
 *
 * @author libiao
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
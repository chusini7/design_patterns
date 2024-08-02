package demo.pattern.visitor;

/**
 * 访问者（Visitor）： 定义了访问元素的接口。
 *
 * @author libiao
 */
public interface ComputerPartVisitor {
    
    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
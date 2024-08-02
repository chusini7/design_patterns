package demo.pattern.visitor;

/**
 * 访问者模式
 * 客户端（Client）（可选）：使用访问者模式对对象结构进行操作。
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        ComputerPartDisplayVisitor visitor = new ComputerPartDisplayVisitor();
        new Computer().accept(visitor);
        System.out.println();
        new Mouse().accept(visitor);
    }
}
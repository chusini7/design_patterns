package demo.pattern.visitor;

/**
 * 对象结构（Object Structure）（可选）：定义了如何组装具体元素，如一个组合类。
 *
 * @author libiao
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
    }
}
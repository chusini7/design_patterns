package cn.efreight.pattern.composite.v1;

import java.util.List;

/**
 * 叶子节点
 *
 * @author libiao
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void addComposite(Component c) {
        System.out.println("叶子节点");
    }

    @Override
    public void removeComposite(Component c) {
        System.out.println("叶子节点");
    }

    @Override
    public List<Component> getComposite() {
        System.out.println("叶子节点-没有子节点");
        return null;
    }

    @Override
    public void operation() {
        System.out.println(name + " 叶子节点-业务方法");
    }
}
package cn.efreight.pattern.composite.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 复合节点
 *
 * @author libiao
 */
public class Composite implements Component {

    private final List<Component> list = new ArrayList<>();

    @Override
    public void addComposite(Component c) {
        list.add(c);
    }

    @Override
    public void removeComposite(Component c) {
        list.remove(c);
    }

    @Override
    public List<Component> getComposite() {
        return list;
    }

    @Override
    public void operation() {
        for (Component obj : list) {
            obj.operation();
        }
    }


}
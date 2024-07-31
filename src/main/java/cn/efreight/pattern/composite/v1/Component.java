package cn.efreight.pattern.composite.v1;

import java.util.List;

/**
 * 容器类的抽象类
 *
 * @author libiao
 */
public interface Component {

    /**
     * 添加成员
     */
    void addComposite(Component c);

    /**
     * 移除成员
     */
    void removeComposite(Component c);

    /**
     * 获取子容器
     */
    List<Component> getComposite();

    /**
     * 业务方法
     */
    void operation();

}
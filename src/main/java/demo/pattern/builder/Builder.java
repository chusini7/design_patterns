package demo.pattern.builder;

/**
 * 规范产品的组建，一般是由子类实现具体的组建过程
 *
 * @author libiao
 */
public abstract class Builder {

    /**
     * 主板
     */
    abstract void buildBoard(String board);

    /**
     * 显示器
     */
    abstract void buildDisplay(String display);

    /**
     * 系统
     */
    abstract void buildOs();

    abstract Computer build();

}
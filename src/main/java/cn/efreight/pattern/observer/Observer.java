package cn.efreight.pattern.observer;

/**
 * 所有观察者需要实现此接口
 *
 * @author libiao
 */
public interface Observer {

    void update(String msg);
}

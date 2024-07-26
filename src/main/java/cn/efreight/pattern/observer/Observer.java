package cn.efreight.pattern.observer;

/**
 * 所有观察者需要实现此接口
 *
 * @author libiao
 * @date 2024/7/16
 */
public interface Observer {

    void update(String msg);
}

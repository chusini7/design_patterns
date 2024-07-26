package cn.efreight.pattern.observer;

/**
 * 专题接口,所有的主题必须实现此接口
 *
 * @author libiao
 * @date 2024/7/16
 */
interface Subject {

    /**
     * 注册一个观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers();

}

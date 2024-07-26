package cn.efreight.pattern.observer;

import lombok.ToString;

/**
 * 观察者A
 *
 * @author libiao
 * @date 2024/7/16
 */
@ToString
public class ObserverA implements Observer {

    private Subject subject;

    public ObserverA(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("observerA 得到消息 -> " + msg);
    }
}

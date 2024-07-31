package cn.efreight.pattern.observer;

import lombok.ToString;

/**
 * 观察者B
 *
 * @author libiao
 */
@ToString
public class ObserverB implements Observer {

    private Subject subject;

    public ObserverB(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("observerB 得到消息 -> " + msg);
    }
}

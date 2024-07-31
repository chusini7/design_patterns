package cn.efreight.pattern.observer;

import java.util.ArrayList;

/**
 * 订阅主题的实现类
 *
 * @author libiao
 */
public class SubjectA implements Subject {

    private final ArrayList<Observer> observers = new ArrayList<>();

    /**
     * 问候语
     */
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("SubjectA 注册 observer -> " + observer);
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("移除 observer -> " + observer);
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    /**
     * 主题信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}

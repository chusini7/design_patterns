package demo.pattern.observer;

/**
 * 观察者模式测试类
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        //模拟一个3D的服务号
        SubjectA subjectA = new SubjectA();
        //客户1
        Observer observerA = new ObserverA(subjectA);
        Observer observerB = new ObserverB(subjectA);

        subjectA.setMsg("在吗？" );
        subjectA.setMsg("在干嘛？" );

        subjectA.removeObserver(observerA);

        subjectA.setMsg("多喝热水" );
    }
}

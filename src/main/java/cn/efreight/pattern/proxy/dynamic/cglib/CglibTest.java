package cn.efreight.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * @author libiao
 */
public class CglibTest {

    // public static void main(String args[]) {
    //     Enhancer enhancer = new Enhancer();
    //     enhancer.setSuperclass(TargetObject.class);
    //     enhancer.setCallback(new TargetInterceptor());
    //     TargetObject proxy = (TargetObject) enhancer.create();
    //
    //     System.out.println(proxy);
    //     System.out.println(proxy.method1("mmm1"));
    //     System.out.println(proxy.method2(100));
    //     System.out.println(proxy.method3(200));
    // }

    public static void main(String args[]) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetObject.class);

        /**
         * (1)callback1：方法拦截器
         * (2)NoOp.INSTANCE：这个NoOp表示no operator，即什么操作也不做，代理类直接调用被代理的方法不进行拦截。
         * (3)FixedValue：表示锁定方法返回值，无论被代理类的方法返回什么值，回调方法都返回固定值。
         */
        Callback noopCb = NoOp.INSTANCE;
        Callback callback1 = new TargetInterceptor();
        Callback fixedValue = new TargetResultFixed();
        Callback[] callBackArray = new Callback[]{callback1, noopCb, fixedValue};
        enhancer.setCallbacks(callBackArray);

        enhancer.setCallbackFilter(new TargetMethodCallbackFilter());

        TargetObject proxy = (TargetObject) enhancer.create();
        System.out.println(proxy);
        System.out.println(proxy.method1("mmm1"));
        System.out.println(proxy.method2(100));
        System.out.println(proxy.method3(200));
    }
}
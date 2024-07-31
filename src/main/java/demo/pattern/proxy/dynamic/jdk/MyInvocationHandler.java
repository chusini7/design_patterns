package demo.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author libiao
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前的代理操作...");
        // 通过反射调用目标方法
        Object result = method.invoke(target, args);
        System.out.println("方法执行后的代理操作...");
        return result;
    }
}

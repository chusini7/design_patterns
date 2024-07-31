package demo.pattern.proxy.dynamic.cglib.interfacemaker;

import demo.pattern.proxy.dynamic.cglib.TargetObject;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InterfaceMaker;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Method;

/**
 * 接口生成器InterfaceMaker
 *
 * @author libiao
 */
public class TestInterfaceMaker {

    public static void main(String[] args) throws Exception {
        InterfaceMaker interfaceMaker = new InterfaceMaker();
        // 抽取某个类的方法生成接口方法
        interfaceMaker.add(TargetObject.class);
        Class<?> targetInterface = interfaceMaker.create();
        for (Method method : targetInterface.getMethods()) {
            System.out.println(method.getName());
        }
        // 接口代理并设置代理接口方法拦截
        Object object = Enhancer.create(Object.class, new Class[]{targetInterface},
                (MethodInterceptor) (obj, method, args1, methodProxy) -> {
                    if ("method1".equals(method.getName())) {
                        System.out.println("filter method1 ");
                        return "11111";
                    }
                    if ("method2".equals(method.getName())) {
                        System.out.println("filter method2 ");
                        return 2222;
                    }
                    if ("method3".equals(method.getName())) {
                        System.out.println("filter method3 ");
                        return 3333;
                    }
                    return "default";
                });
        Method method3 = object.getClass().getMethod("method3", int.class);
        int i = (int) method3.invoke(object, new Object[]{33});
        System.out.println(i);
        Method method1 = object.getClass().getMethod("method1", String.class);
        System.out.println(method1.invoke(object, "sdfs"));
    }
}
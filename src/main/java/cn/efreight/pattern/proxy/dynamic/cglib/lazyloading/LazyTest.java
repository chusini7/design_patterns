package cn.efreight.pattern.proxy.dynamic.cglib.lazyloading;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * 延迟加载
 *
 * @author libiao
 */
public class LazyTest {

    public static void main(String[] args) {
        // 输出cglib动态代理产生的类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/libiao/Java/JetBrains/IdeaProjects/myProjects/design_patterns");

        LazyBean lazyBean = new LazyBean("张三", 18);
        System.out.println("------------------");
        PropertyBean propertyBean = lazyBean.getPropertyBean();
        System.out.println(propertyBean.getKey());
        System.out.println(propertyBean.getValue());
        System.out.println("------------------");
        PropertyBean propertyBean2 = lazyBean.getPropertyBean();
        System.out.println(propertyBean2.getKey());
        System.out.println(propertyBean2.getValue());
        System.out.println("------------------");
        PropertyBean propertyBeanDispatcher = lazyBean.getPropertyBeanDispatcher();
        System.out.println(propertyBeanDispatcher.getKey());
        System.out.println(propertyBeanDispatcher.getValue());
        System.out.println("------------------");
        PropertyBean propertyBeanDispatcher2 = lazyBean.getPropertyBeanDispatcher();
        System.out.println(propertyBeanDispatcher2.getKey());
        System.out.println(propertyBeanDispatcher2.getValue());
    }
}

package demo.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


/**
 * @author libiao
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        // 让JVM生成的代理类字节码被保存到磁盘上, 路径：工程目录下 com.sun.proxy 下,
        // 生成的代理对象class文件格式： com.sun.proxy.$Proxy + 序号.class
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Image image = new RealImage();
        InvocationHandler handler = new MyInvocationHandler(image);
        Image proxyInstance = (Image) Proxy.newProxyInstance(image.getClass().getClassLoader(), image.getClass().getInterfaces(), handler);
        // 执行的是代理的方法
        proxyInstance.display();

        Proxy proxy = (Proxy) proxyInstance;
        Class<?> proxyClass = proxy.getProxyClass(Image.class.getClassLoader(), image.getClass().getInterfaces());
        System.out.println(proxyClass);
    }
}

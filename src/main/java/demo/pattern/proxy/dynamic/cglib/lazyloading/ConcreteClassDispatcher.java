package demo.pattern.proxy.dynamic.cglib.lazyloading;

import net.sf.cglib.proxy.Dispatcher;

/**
 * @author libiao
 */
public class ConcreteClassDispatcher implements Dispatcher {

    @Override
    public Object loadObject() throws Exception {
        System.out.println("Dispatcher loadObject() run...");
        PropertyBean propertyBean = new PropertyBean();
        propertyBean.setKey("xxx");
        propertyBean.setValue(10);
        return propertyBean;
    }

}
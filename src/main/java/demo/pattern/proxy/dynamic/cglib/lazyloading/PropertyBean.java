package demo.pattern.proxy.dynamic.cglib.lazyloading;

import lombok.Getter;
import lombok.Setter;

/**
 * @author libiao
 */
@Setter
@Getter
public class PropertyBean {

    private String key;
    private Integer value;

    @Override
    public String toString() {
        return "PropertyBean [key=" + key + ", value=" + value + "]" + getClass();
    }

}
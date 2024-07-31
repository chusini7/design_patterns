package demo.pattern.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * @author libiao
 */
@Getter
public abstract class Shape implements Cloneable {

    @Setter
    private String id;

    protected String type;

    abstract void draw();

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
package cn.efreight.pattern.state;

import lombok.Getter;
import lombok.Setter;

/**
 * @author libiao
 */
@Getter
@Setter
public abstract class LampState {

    private LampContext lampContext;

    // public LampState(LampContext lampContext) {
    //     this.lampContext = lampContext;
    // }

    /**
     * 转绿灯
     */
    protected abstract void turnGreen();

    /**
     * 转黄灯
     */
    protected abstract void turnYellow();

    /**
     * 转红灯
     */
    protected abstract void turnRed();
}

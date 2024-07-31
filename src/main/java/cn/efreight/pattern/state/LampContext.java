package cn.efreight.pattern.state;

import lombok.Getter;
import lombok.Setter;

/**
 * 上下文对象
 *
 * @author libiao
 */
@Getter
public class LampContext {

    public static LampState RED_LAMP_STATE = new RedLampState();
    public static LampState GREEN_LAMP_STATE = new GreenLampState();
    public static LampState YELLOW_LAMP_STATE = new YellowLampState();

    private LampState lampState;

    public void setLampState(LampState lampState) {
        this.lampState = lampState;
        this.lampState.setLampContext(this);
    }

    public void turnGreen() {
        lampState.turnGreen();
    }

    public void turnYellow() {
        lampState.turnYellow();
    }

    public void turnRed() {
        lampState.turnRed();
    }

}

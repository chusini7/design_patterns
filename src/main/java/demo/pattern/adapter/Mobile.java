package demo.pattern.adapter;

/**
 * @author libiao
 */
public class Mobile {

    /**
     * 充电
     * @param power 充电器
     */
    public void inputPower(V5Power power) {
        int provideV5Power = power.provideV5Power();
        System.out.println("手机充电需要5V电压，现在是 -> " + provideV5Power + "V");
    }
}

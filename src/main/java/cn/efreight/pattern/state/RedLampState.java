package cn.efreight.pattern.state;

/**
 * 红灯
 *
 * @author libiao
 * @date 2024/7/18
 */
public class RedLampState extends LampState {

    @Override
    protected void turnGreen() {
        System.out.println("红灯 变 绿灯");
        getLampContext().setLampState(LampContext.GREEN_LAMP_STATE);
    }

    @Override
    protected void turnYellow() {
        System.out.println("对不起，红灯 只能 变 绿灯");
    }

    @Override
    protected void turnRed() {
        System.out.println("现在就是 红灯");
    }
}

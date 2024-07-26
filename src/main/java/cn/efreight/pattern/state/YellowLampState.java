package cn.efreight.pattern.state;

/**
 * 黄灯
 *
 * @author libiao
 * @date 2024/7/18
 */
public class YellowLampState extends LampState {

    @Override
    protected void turnGreen() {
        System.out.println("对不起，黄灯 只能 转 红灯");
    }

    @Override
    protected void turnYellow() {
        System.out.println("现在就是 黄灯");
    }

    @Override
    protected void turnRed() {
        System.out.println("黄灯 变 红灯");
        getLampContext().setLampState(LampContext.RED_LAMP_STATE);
    }
}

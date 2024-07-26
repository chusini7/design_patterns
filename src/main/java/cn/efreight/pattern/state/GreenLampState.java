package cn.efreight.pattern.state;

/**
 * 绿灯
 *
 * @author libiao
 * @date 2024/7/18
 */
public class GreenLampState extends LampState {

    @Override
    protected void turnGreen() {
        System.out.println("现在就是 绿灯");
    }

    @Override
    protected void turnYellow() {
        System.out.println("绿灯 变 黄灯");
        getLampContext().setLampState(LampContext.YELLOW_LAMP_STATE);
    }

    @Override
    protected void turnRed() {
        System.out.println("对不起，绿灯 只能 转 黄灯");
    }
}

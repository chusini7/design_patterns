package cn.efreight.pattern.state;

/**
 * 状态模式
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        LampContext context = new LampContext();
        context.setLampState(LampContext.RED_LAMP_STATE);

        context.turnGreen();
        context.turnYellow();
        context.turnRed();

        context.turnYellow();
        context.turnRed();

        context.turnGreen();
        context.turnRed();

    }
}

package demo.pattern.factory;

/**
 * 工厂测试类
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        RobotFactory robotFactory = new RobotFactory();
        Robot boy = robotFactory.getRobot("boy");
        boy.dancing();
        Robot girl = robotFactory.getRobot("girl");
        girl.rubdown();
    }
}

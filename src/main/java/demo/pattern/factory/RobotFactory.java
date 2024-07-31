package demo.pattern.factory;

/**
 * 机器人工厂
 *
 * @author libiao
 */
public class RobotFactory {

    public Robot getRobot(String robotType) {
        Robot robot = null;
        switch (robotType) {
            case "boy": robot = new BoyRobot(); break;
            case "girl": robot = new GirlRobot(); break;
        }
        return robot;
    }
}

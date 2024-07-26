package cn.efreight.pattern.factory;

/**
 * 机器人工厂
 *
 * @author libiao
 * @date 2024/7/16
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

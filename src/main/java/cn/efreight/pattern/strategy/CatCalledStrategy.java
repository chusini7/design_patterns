package cn.efreight.pattern.strategy;

/**
 * @author libiao
 * @date 2024/7/16
 */
public class CatCalledStrategy implements CalledStrategy {

    @Override
    public String called() {
        return "猫叫";
    }
}

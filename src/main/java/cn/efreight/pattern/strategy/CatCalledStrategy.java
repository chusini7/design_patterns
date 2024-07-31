package cn.efreight.pattern.strategy;

/**
 * @author libiao
 */
public class CatCalledStrategy implements CalledStrategy {

    @Override
    public String called() {
        return "猫叫";
    }
}

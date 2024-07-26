package cn.efreight.pattern.strategy;

/**
 * @author libiao
 * @date 2024/7/16
 */
public class DogCalledStrategy implements CalledStrategy {

    @Override
    public String called() {
        return "狗叫";
    }
}

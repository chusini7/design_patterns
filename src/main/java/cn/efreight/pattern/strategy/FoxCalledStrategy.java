package cn.efreight.pattern.strategy;

/**
 * @author libiao
 * @date 2024/7/16
 */
public class FoxCalledStrategy implements CalledStrategy {

    @Override
    public String called() {
        return "狐狸叫";
    }
}

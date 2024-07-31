package cn.efreight.pattern.strategy;

/**
 * @author libiao
 */
public class FoxCalledStrategy implements CalledStrategy {

    @Override
    public String called() {
        return "狐狸叫";
    }
}

package demo.pattern.strategy;

/**
 * @author libiao
 */
public class DogCalledStrategy implements CalledStrategy {

    @Override
    public String called() {
        return "狗叫";
    }
}

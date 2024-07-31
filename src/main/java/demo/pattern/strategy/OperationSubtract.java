package demo.pattern.strategy;

/**
 * subtract 策略
 *
 * @author libiao
 */
public class OperationSubtract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
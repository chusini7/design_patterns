package demo.pattern.strategy;

/**
 * multiply 策略
 *
 * @author libiao
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
package cn.efreight.pattern.strategy;

/**
 * add 策略
 *
 * @author libiao
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
package cn.efreight.pattern.strategy;

import lombok.Setter;

/**
 * 环境
 *
 * @author libiao
 */
@Setter
public class Context {

    private Strategy strategy;
    private CalledStrategy calledStrategy;

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

    public String executeCalled() {
        return calledStrategy.called();
    }
}
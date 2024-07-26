package cn.efreight.pattern.strategy;

/**
 * 策略模式测试
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new OperationAdd());
        context.setCalledStrategy(new DogCalledStrategy());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5) + "\r\n called -> " + context.executeCalled());

        Context context2 = new Context();
        context2.setStrategy(new OperationSubtract());
        context2.setCalledStrategy(new CatCalledStrategy());
        System.out.println("10 - 5 = " + context2.executeStrategy(10, 5) + "\r\n called -> " + context2.executeCalled());

        Context context3 = new Context();
        context3.setStrategy(new OperationMultiply());
        context3.setCalledStrategy(new FoxCalledStrategy());
        System.out.println("10 * 5 = " + context3.executeStrategy(10, 5) + "\r\n called -> " + context3.executeCalled());
    }
}
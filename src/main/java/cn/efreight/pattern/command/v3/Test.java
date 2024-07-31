package cn.efreight.pattern.command.v3;

/**
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        // 创建接收者，就是我们的计算机的处理器
        Processor processor = new Processor();
        // 创建计算器对象
        Calculator calculator = new Calculator();

        System.out.println("爸爸：小明，过来帮爸爸算算今天赚了多少钱");
        System.out.println("小明：来了，爸爸你说吧");
        System.out.println("爸爸：白菜卖了20块");
        AddCommand addCommand = new AddCommand(processor, 20);
        calculator.setAddCommand(addCommand);
        calculator.addPressed();
        System.out.println("小明：卖白菜的钱：" + processor.getResult());

        System.out.println("爸爸：萝卜卖了15块");
        addCommand = new AddCommand(processor, 15);
        calculator.setAddCommand(addCommand);
        calculator.addPressed();
        System.out.println("小明：加上卖萝卜的钱：" + processor.getResult());

        System.out.println("买了一包烟，花了5块");
        SubtractCommand subtractCommand = new SubtractCommand(processor, 5);
        calculator.setSubtractCommand(subtractCommand);
        calculator.subtractPressed();
        System.out.println("小明：减去买烟的钱：" + processor.getResult());

        System.out.println("爸爸：不对好像算错了，重来");
        calculator.undoPressed();
        System.out.println("小明：撤销一次后：" + processor.getResult());
        calculator.undoPressed();
        System.out.println("小明：撤销两次后：" + processor.getResult());
        calculator.undoPressed();
        System.out.println("小明：撤销三次后：" + processor.getResult());

        System.out.println("爸爸：哈哈~好像白菜和萝卜没算错，烟这个是私房钱买的，别算进去了");
        calculator.redoPressed();
        System.out.println("小明：恢复一次操作：" + processor.getResult());
        calculator.redoPressed();
        System.out.println("小明：恢复两次操作：" + processor.getResult());
    }
}

package demo.pattern.command.v3;

/**
 * 减法命令
 *
 * @author libiao
 */
public class SubtractCommand implements Command {

    /**
     * 持有真正进行运算操作的对象
     */
    private final Processor processor;

    /**
     * 要减去的数值
     */
    private final int number;

    public SubtractCommand(Processor processor, int number) {
        this.processor = processor;
        this.number = number;
    }

    @Override
    public void execute() {
        this.processor.subtract(number);
    }

    @Override
    public void undo() {
        this.processor.add(number);
    }

}

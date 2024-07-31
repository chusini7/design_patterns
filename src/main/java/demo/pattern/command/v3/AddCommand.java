package demo.pattern.command.v3;

/**
 * 加法命令
 *
 * @author libiao
 */
public class AddCommand implements Command {

    /**
     * 持有真正进行运算操作的对象
     */
    private final Processor processor;

    /**
     * 要加上的数值
     */
    private final int number;

    public AddCommand(Processor processor, int number) {
        this.processor = processor;
        this.number = number;
    }

    @Override
    public void execute() {
        this.processor.add(number);
    }

    @Override
    public void undo() {
        this.processor.subtract(number);
    }

}

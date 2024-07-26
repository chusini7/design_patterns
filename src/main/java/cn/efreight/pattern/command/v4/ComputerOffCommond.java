package cn.efreight.pattern.command.v4;

/**
 * @author libiao
 * @date 2024/7/17
 */
public class ComputerOffCommond implements Command {

    private Computer computer;

    public ComputerOffCommond(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }
}

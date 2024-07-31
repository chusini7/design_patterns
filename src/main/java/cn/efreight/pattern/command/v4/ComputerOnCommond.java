package cn.efreight.pattern.command.v4;

/**
 * @author libiao
 */
public class ComputerOnCommond implements Command {

    private Computer computer;

    public ComputerOnCommond(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }
}

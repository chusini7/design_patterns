package cn.efreight.pattern.command.v1;

/**
 * 请求者角色类
 *
 * @author libiao
 */
public class Invoker {

    /**
     * 持有命令对象
     */
    private Command command;

    /**
     * 构造方法
     * @param command
     */
    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 行动方法
     */
    public void action() {
        command.execute();
    }
}
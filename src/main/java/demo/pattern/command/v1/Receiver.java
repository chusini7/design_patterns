package demo.pattern.command.v1;

/**
 * 接收者角色类
 *
 * @author libiao
 */
public class Receiver {

    /**
     * 真正执行命令相应的操作
     */
    public void action() {
        System.out.println("执行操作");
    }
}
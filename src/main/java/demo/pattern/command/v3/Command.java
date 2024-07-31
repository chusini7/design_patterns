package demo.pattern.command.v3;

/**
 * 命令接口，声明执行、撤销操作
 *
 * @author libiao
 */
public interface Command {

    /**
     * 执行命令对应的操作
     */
    void execute();

    /**
     * 执行撤销命令对应的操作
     */
    void undo();

}

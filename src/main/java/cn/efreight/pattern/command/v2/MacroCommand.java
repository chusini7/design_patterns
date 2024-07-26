package cn.efreight.pattern.command.v2;

/**
 * 宏命令接口：执行一组命令
 *
 * @author libiao
 */
public interface MacroCommand extends Command {

    /**
     * 宏命令集的管理方法
     * 可以添加一个成员命令
     * @param command
     */
    public void add(Command command);

    /**
     * 宏命令集的管理方法
     * 可以移除一个成员命令
     * @param command
     */
    public void remove(Command command);
}
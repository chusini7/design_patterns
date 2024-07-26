package cn.efreight.pattern.command.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的宏命令 负责把单个的命令合成宏命令
 *
 * @author libiao
 */
public class MacroAudioCommand implements MacroCommand {

    private final List<Command> commandList = new ArrayList<>();

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        System.out.println("---自动回放保存的命令---");
        for (Command command : commandList) {
            command.execute();
        }
        System.out.println("---宏命令集回放完成---");
    }

    /**
     * 宏命令集管理方法
     */
    @Override
    public void add(Command command) {
        commandList.add(command);
    }

    /**
     * 宏命令集管理方法
     */
    @Override
    public void remove(Command command) {
        commandList.remove(command);
    }
}
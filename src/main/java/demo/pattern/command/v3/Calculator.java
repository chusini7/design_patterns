package demo.pattern.command.v3;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算器类，上边有加法、减法、撤销和恢复按钮
 *
 * @author libiao
 */
@Data
public class Calculator {

    /**
     * 操作的命令的记录，撤销时用
     */
    private List<Command> undoCmds = new ArrayList<>();

    /**
     * 撤销的命令的记录，恢复时用
     */
    private List<Command> redoCmds = new ArrayList<>();

    private Command addCommand;
    private Command subtractCommand;

    /**
     * 执行加法操作
     */
    public void addPressed() {
        this.addCommand.execute();
        //把操作记录到历史记录里面
        undoCmds.add(this.addCommand);
    }

    /**
     * 执行减法操作
     */
    public void subtractPressed() {
        this.subtractCommand.execute();
        //把操作记录到历史记录里面
        undoCmds.add(subtractCommand);
    }

    /**
     * 撤销一步操作
     */
    public void undoPressed() {
        if (!this.undoCmds.isEmpty()) {
            //取出最后一个命令来撤销
            Command cmd = this.undoCmds.get(this.undoCmds.size() - 1);
            cmd.undo();
            //把这个命令记录到恢复的历史记录里面
            this.redoCmds.add(cmd);
            //把最后一个命令删除掉，
            this.undoCmds.remove(cmd);
        } else {
            System.out.println("很抱歉，没有可撤销的命令");
        }
    }

    /**
     * 恢复一步操作
     */
    public void redoPressed() {
        if (!this.redoCmds.isEmpty()) {
            //取出最后一个命令来恢复
            Command cmd = this.redoCmds.get(this.redoCmds.size() - 1);
            cmd.execute();
            //把命令记录到可撤销的历史记录里面
            this.undoCmds.add(cmd);
            //把最后一个命令删除掉
            this.redoCmds.remove(cmd);
        } else {
            System.out.println("很抱歉，没有可恢复的命令");
        }
    }
}

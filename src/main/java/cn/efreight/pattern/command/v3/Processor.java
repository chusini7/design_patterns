package cn.efreight.pattern.command.v3;

import lombok.Data;

/**
 * 计算器的处理器，真正实现运算操作
 *
 * @author libiao
 */
@Data
public class Processor {

    /**
     * 记录运算的结果
     */
    private int result;

    public void add(int num) {
        //实现加法功能
        result += num;
    }

    public void subtract(int num) {
        //实现减法功能
        result -= num;
    }
}

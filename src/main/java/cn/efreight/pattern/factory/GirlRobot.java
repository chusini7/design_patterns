package cn.efreight.pattern.factory;

/**
 * @author libiao
 * @date 2024/7/16
 */
public class GirlRobot implements Robot {

    @Override
    public void singing() {
        System.out.println("夹子音开始唱歌了...");
    }

    @Override
    public void dancing() {
        System.out.println("罗圈腿表演开始了...");
    }

    @Override
    public void rubdown() {
        System.out.println("搓的那叫一个地道！");
    }
}

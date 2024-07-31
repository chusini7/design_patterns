package demo.pattern.factory;

/**
 * @author libiao
 */
public class BoyRobot implements Robot {

    @Override
    public void singing() {
        System.out.println("小苹果...");
    }

    @Override
    public void dancing() {
        System.out.println("钢管舞有画面了...");
    }

    @Override
    public void rubdown() {
        System.out.println("你会搓澡吗，换一个！");
    }
}

package cn.efreight.pattern.builder;

/**
 * 抽象产品类
 *
 * @author libiao
 */
public abstract class Computer {

    protected String mBoard;
    protected String mDisplay;
    protected String mOs;

    public void setBoard(String board) {
        mBoard = board;
    }

    public void setDisplay(String display) {
        this.mDisplay = display;
    }

    public abstract void setOs();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
package cn.efreight.pattern.builder;

/**
 * 具体的Builder类，具体的创建对象的类
 *
 * @author libiao
 */
public class MacBookBuilder extends Builder {

    private final Computer mComputer = new MacBook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOs() {
        mComputer.setOs();
    }

    @Override
    public Computer build() {
        return mComputer;
    }
}
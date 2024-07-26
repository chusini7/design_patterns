package cn.efreight.pattern.builder;

/**
 * 统一组建过程
 *
 * @author libiao
 */
public class Director {

    private Builder builder;

    public Director(Builder builer) {
        this.builder = builer;
    }

    public void construct(String board, String display) {
        builder.buildDisplay(display);
        builder.buildBoard(board);
        builder.buildOs();
    }
}
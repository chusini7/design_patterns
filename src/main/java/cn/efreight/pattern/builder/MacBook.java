package cn.efreight.pattern.builder;

/**
 * 产品类
 *
 * @author libiao
 */
public class MacBook extends Computer {

    @Override
    public void setOs() {
        mOs = "Mac OS X 12";
    }
}
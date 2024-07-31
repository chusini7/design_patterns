package cn.efreight.pattern.bridge;

/**
 * @author libiao
 */
public class BlueColorApi implements ColorApi {

    @Override
    public void paint() {
        System.out.println("画上蓝色");
    }
}

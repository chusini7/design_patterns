package demo.pattern.bridge;

/**
 * @author libiao
 */
public class RedColorApi implements ColorApi {

    @Override
    public void paint() {
        System.out.println("画上红色");
    }
}

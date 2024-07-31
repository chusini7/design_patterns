package demo.pattern.bridge;

/**
 * @author libiao
 */
public class GreenColorAPI implements ColorApi {

    @Override
    public void paint() {
        System.out.println("画上绿色");
    }
}

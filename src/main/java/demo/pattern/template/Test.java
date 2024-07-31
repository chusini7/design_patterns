package demo.pattern.template;

/**
 * 模板方法模式
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
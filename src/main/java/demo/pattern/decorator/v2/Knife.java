package demo.pattern.decorator.v2;

/**
 * 刀
 *
 * @author libiao
 */
public class Knife implements Weapons {

    @Override
    public String name() {
        return "屠龙刀";
    }

    @Override
    public int attackPower() {
        return 100;
    }
}

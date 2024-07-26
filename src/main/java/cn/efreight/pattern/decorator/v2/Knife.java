package cn.efreight.pattern.decorator.v2;

/**
 * 刀
 *
 * @author libiao
 * @date 2024/7/17
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

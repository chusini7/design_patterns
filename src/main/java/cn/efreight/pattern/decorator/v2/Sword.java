package cn.efreight.pattern.decorator.v2;

/**
 * 剑
 *
 * @author libiao
 */
public class Sword implements Weapons {

    @Override
    public String name() {
        return "倚天剑";
    }

    @Override
    public int attackPower() {
        return 90;
    }
}

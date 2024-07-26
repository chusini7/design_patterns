package cn.efreight.pattern.decorator.v2;

/**
 * @author libiao
 * @date 2024/7/17
 */
public abstract class WeaponsDecorator implements Weapons {

    protected Weapons weapons;

    protected WeaponsDecorator(Weapons weapons) {
        this.weapons = weapons;
    }

    @Override
    public String name() {
        return weapons.name();
    }

    @Override
    public int attackPower() {
        return weapons.attackPower();
    }
}

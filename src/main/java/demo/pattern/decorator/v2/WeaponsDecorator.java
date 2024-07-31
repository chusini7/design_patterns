package demo.pattern.decorator.v2;

/**
 * @author libiao
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

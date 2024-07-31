package demo.pattern.decorator.v2;

/**
 * 蓝宝石装饰器
 * 蓝宝石增加 10攻击力
 *
 * @author libiao
 */
public class BlueGemDecorator extends WeaponsDecorator {

    public BlueGemDecorator(Weapons weapons) {
        super(weapons);
    }

    @Override
    public String name() {
        return super.name() + " + 蓝宝石";
    }

    @Override
    public int attackPower() {
        return super.attackPower() + 10;
    }
}

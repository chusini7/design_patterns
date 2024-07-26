package cn.efreight.pattern.decorator.v2;

/**
 * 红宝石装饰器
 * 红宝石增加 20攻击力
 *
 * @author libiao
 * @date 2024/7/17
 */
public class RedGemDecorator extends WeaponsDecorator {

    public RedGemDecorator(Weapons weapons) {
        super(weapons);
    }

    @Override
    public String name() {
        return super.name() + " + 红宝石";
    }

    @Override
    public int attackPower() {
        return super.attackPower() + 20;
    }
}

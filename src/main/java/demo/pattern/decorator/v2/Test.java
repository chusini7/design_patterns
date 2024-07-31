package demo.pattern.decorator.v2;

/**
 * 装饰者模式测试
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        // 一个镶嵌2颗红宝石，1颗蓝宝石的靴子
        System.out.println("一个镶嵌2颗红宝石，1颗蓝宝石的刀");
        Weapons equip = new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new Knife())));
        System.out.println("武器名: " + equip.name());
        System.out.println("攻击力: " + equip.attackPower());
        System.out.println("-------");
        // 一个镶嵌1颗红宝石，1颗蓝宝石的武器
        System.out.println("一个镶嵌1颗红宝石，1颗蓝宝石的剑");
        equip = new RedGemDecorator(new BlueGemDecorator(new RedGemDecorator(new Sword())));
        System.out.println("武器名: " + equip.name());
        System.out.println("攻击力: " + equip.attackPower());
    }
}

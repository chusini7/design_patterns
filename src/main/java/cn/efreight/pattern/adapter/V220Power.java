package cn.efreight.pattern.adapter;

/**
 * 家用220V交流电
 *
 * @author libiao
 */
public class V220Power {

    /**
     * 提供220V电压
     */
    public int provideV220Power() {
        System.out.println("我提供220V交流电压。");
        return 220;
    }
}

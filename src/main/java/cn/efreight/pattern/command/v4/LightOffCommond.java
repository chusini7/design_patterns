package cn.efreight.pattern.command.v4;

/**
 * @author libiao
 * @date 2024/7/17
 */
public class LightOffCommond implements Command {

    private Light light;

    public LightOffCommond(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}

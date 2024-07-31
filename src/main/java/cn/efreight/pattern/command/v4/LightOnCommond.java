package cn.efreight.pattern.command.v4;

/**
 * @author libiao
 */
public class LightOnCommond implements Command {

    private Light light;

    public LightOnCommond(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

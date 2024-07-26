package cn.efreight.pattern.command.v4;

/**
 * @author libiao
 * @date 2024/7/17
 */
public class DoorOffCommond implements Command {

    private Door door;

    public DoorOffCommond(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}

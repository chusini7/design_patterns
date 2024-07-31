package cn.efreight.pattern.command.v4;

/**
 * @author libiao
 */
public class DoorOnCommond implements Command {

    private Door door;

    public DoorOnCommond(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}

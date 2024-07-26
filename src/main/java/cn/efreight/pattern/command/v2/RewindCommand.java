package cn.efreight.pattern.command.v2;

/**
 * 倒带命令
 *
 * @author libiao
 */
public class RewindCommand implements Command {

    private AudioPlayer audio;

    public RewindCommand(AudioPlayer audio) {
        this.audio = audio;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        audio.rewind();
    }
}
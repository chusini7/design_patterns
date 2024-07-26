package cn.efreight.pattern.command.v2;

/**
 * 播放命令
 *
 * @author libiao
 */
public class PlayCommand implements Command {

    private AudioPlayer audio;

    public PlayCommand(AudioPlayer audio) {
        this.audio = audio;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        audio.play();
    }
}
package demo.pattern.responsibilityChain.v1;

import lombok.Setter;

/**
 * @author libiao
 */
public abstract class Logger {

    public static int DEBUG = 1;
    public static int INFO = 2;
    public static int ERROR = 3;

    protected int level;

    // 责任链中的下一个元素
    @Setter
    protected Logger nextLogger;

    public void logMessage(int level, String message) {
        if (this.level == level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
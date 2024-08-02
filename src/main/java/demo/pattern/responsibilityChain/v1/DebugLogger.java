package demo.pattern.responsibilityChain.v1;

/**
 * @author libiao
 */
public class DebugLogger extends Logger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("DebugLogger: " + message);
    }
}
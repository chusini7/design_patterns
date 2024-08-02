package demo.pattern.responsibilityChain.v1;

/**
 * 责任链模式
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        // loggerChain.logMessage(Logger.DEBUG, "This is a debug log message.");
        // loggerChain.logMessage(Logger.INFO, "This is an info log message.");
        loggerChain.logMessage(Logger.ERROR, "This is an error log message.");
    }

    private static Logger getChainOfLoggers() {
        Logger debugLogger = new DebugLogger(Logger.DEBUG);
        Logger infoLogger = new InfoLogger(Logger.INFO);
        Logger errorLogger = new ErrorLogger(Logger.ERROR);

        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(errorLogger);

        return debugLogger;
    }
}
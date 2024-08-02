package demo.pattern.interpreter;

/**
 * @author libiao
 */
public interface Expression {

    boolean interpret(String context);
}
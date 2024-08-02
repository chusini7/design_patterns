package demo.pattern.interpreter;

/**
 * 解释器模式
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        // 规则：Robert 和 John 是男性
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        Expression isMale = new OrExpression(robert, john);
        System.out.println("John is male? " + isMale.interpret("John"));

        // 规则：Julie 是一个已婚的女性
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        Expression isMarriedWoman =  new AndExpression(julie, married);
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
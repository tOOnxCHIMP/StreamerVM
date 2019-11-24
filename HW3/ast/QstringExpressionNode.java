import java_cup.runtime.*;

/**
 * This class represents a number (as an expression in the AST).
 *
 * @author Peter Ohmann + <your name here>
 */
public class QstringExpressionNode extends ExpressionNode {
    private String value;

    public QstringExpressionNode(String text) {
        super();
        try {
            
            this.value = text;
        }
        catch (Exception e) {
            // this exception should never happen, so we'll have the parser
            // crash brutally
            System.err.println("Compilation error: invalid Num '" + text + "'");
            System.exit(1);
        }
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Quoted string: " + this.value ;
    }
}

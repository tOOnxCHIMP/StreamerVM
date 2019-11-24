import java_cup.runtime.*;

/**
 * This class represents a number (as an expression in the AST).
 *
 * @author Peter Ohmann + <your name here>
 */
public class TrueExpressionNode extends ExpressionNode {
    private Boolean  value;

    public TrueExpressionNode() {
        super();
     
            this.value = true;
        }    

    public Boolean getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Boolean literal: true" ;
    }
}

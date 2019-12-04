import java_cup.runtime.*;

/**
 * This class represents a number (as an expression in the AST).
 *
 * @author Peter Ohmann + <your name here>
 */
public class FalseExpressionNode extends ExpressionNode {
    private Boolean  value;

    public FalseExpressionNode() {
        super();
     
            this.value = false;
        }    

    public Boolean getValue() {
        return this.value;
    }

    public String getValue1(){
     return "False"; 
    }
    
    @Override
    public String toString() {
        return "Boolean literal: false" ;
    }
}

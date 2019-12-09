//import java_cup.runtime.*;

/**
 * This class represents an identifier (as an expression in the AST).
 *
 * @author Peter Ohmann + <your name here>
 */
public class IdExpressionNode extends ExpressionNode {
    private String value;

    public IdExpressionNode(String id) {
        super();
        this.value = id;
    }
    
    
    public String getValue1(){
     return this.value; 
    }

    @Override
    public String toString() {
        return "Identifier: " + this.value;
    }
}

import java_cup.runtime.*;

/**
 * This class represents an identifier (as an expression in the AST).
 *
 * @author Peter Ohmann + <your name here>
 */
public class FunctionCallNode extends ExpressionNode {
    private String value;

    public FunctionCallNode(String id, ListExpressionNode e1) {
        super();
        this.value = id;
 this.children.add(e1);
    }

    public String getValue1(){
     return ""; 
    }
    
    @Override
    public String toString() {
        return "Function call: " + this.value;
    }
}

import java_cup.runtime.*;

/**
 * This class represents an assignment expression in the AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class InputExpressionNode extends ExpressionNode {
    private String id;

    public InputExpressionNode(ExpressionNode id) {
        super();
        this.children.add(id);
    }
    
    public String getValue1(){
     return this.id; 
    }


    @Override
    public String toString() {
        return "Input expression ";
    }
}

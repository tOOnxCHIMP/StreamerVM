/**
 * This class represents a binary operation (such as plus, minus, etc.) in the
 * AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class NotOpExpressionNode extends ExpressionNode {
    private ExpressionNode left;
    private String operator;

    /**
     * Represent an infix binary operator; that is "left op right".
     */
    public NotOpExpressionNode(ExpressionNode left,
       String op) {
        super();
        
        this.left = left;
        this.operator = op;
        this.children.add(left);
        
      
    }
    
    public String getValue1(){
     return this.operator; 
    }

    @Override
    public String toString() {
        return "Not expression";
    }
}

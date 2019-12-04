/**
 * This class represents a binary operation (such as plus, minus, etc.) in the
 * AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class ListAccessNode extends ExpressionNode {
    private ExpressionNode left;
    private ExpressionNode right;
    private String operator;

    /**
     * Represent an infix binary operator; that is "left op right".
     */
    public ListAccessNode(ExpressionNode left,
    ExpressionNode right) {
        super();

        this.children.add(left);
 this.children.add(right);
    }

    public String getValue1(){
     return this.operator; 
    }
    
    @Override
    public String toString() {
        return "List Access ";
    }
}

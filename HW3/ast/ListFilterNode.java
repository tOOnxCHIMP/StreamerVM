/**
 * This class represents a binary operation (such as plus, minus, etc.) in the
 * AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class ListFilterNode extends ExpressionNode {
    private ExpressionNode left;
    private ExpressionNode right;
    private String operator;

    /**
     * Represent an infix binary operator; that is "left op right".
     */
    public ListFilterNode(ExpressionNode e, ExpressionNode t) {
        super();
        this.children.add(e);
 this.children.add(t);
    }
    
    public String getValue1(){
     return ""; 
    }

    @Override
    public String toString() {
        return "List Filter";
    }
}

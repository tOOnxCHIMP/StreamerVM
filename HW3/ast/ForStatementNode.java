/**
 * This class represents a binary operation (such as plus, minus, etc.) in the
 * AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class ForStatementNode extends StatementNode {
    private ExpressionNode left;
    private ExpressionNode right;
    private String operator;

    /**
     * Represent an infix binary operator; that is "left op right".
     */
    public ForStatementNode(TypeNode t, String left,
			   ExpressionNode right, StatementListNode itf) {
        super();
	this.children.add(t);
        this.operator = left;
	this.children.add(right);
	this.children.add(itf);
    }

    @Override
    public String toString() {
        return "For Statement: " + this.operator;
    }
}

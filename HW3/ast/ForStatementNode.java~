/**
 * This class represents a binary operation (such as plus, minus, etc.) in the
 * AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class IfStatementNode extends StatementNode {
    private ExpressionNode left;
    private ExpressionNode right;
    private String operator;

    /**
     * Represent an infix binary operator; that is "left op right".
     */
    public IfStatementNode(ExpressionNode left,
			   StatementListNode right, StatementListNode itf) {
        super();

        this.children.add(left);
	this.children.add(right);
	this.children.add(itf);
    }

    @Override
    public String toString() {
        return "If Statement";
    }
}

/**
 * This class represents a binary operation (such as plus, minus, etc.) in the
 * AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class ElseStatementNode extends StatementNode {
    private ExpressionNode left;
    private ExpressionNode right;
    private String operator;

    /**
     * Represent an infix binary operator; that is "left op right".
     */
    public ElseStatementNode(
				StatementListNode right) {
        super();

        
	this.children.add(right);
    }

    @Override
    public String toString() {
        return "Statement List";
    }
}

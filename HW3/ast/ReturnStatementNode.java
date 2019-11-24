/**
 * This class represents a print statement in the AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class ReturnStatementNode extends StatementNode {
    public ReturnStatementNode(ExpressionNode e) {
        super();
        this.children.add(e);
    }

    @Override
    public String toString() {
        return "Return Statement";
    }
}

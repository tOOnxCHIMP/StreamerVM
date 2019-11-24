/**
 * This class represents a print statement in the AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class ExitStatementNode extends StatementNode {
    public ExitStatementNode(ExpressionNode e) {
        super();
        this.children.add(e);
    }

    @Override
    public String toString() {
        return "Exit Statement";
    }
}

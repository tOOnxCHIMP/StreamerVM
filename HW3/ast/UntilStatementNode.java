/**
 * This class represents a print statement in the AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class UntilStatementNode extends StatementNode {
    public UntilStatementNode( StatementNode e, StatementListNode s) {
        super();
        //this.children.add(t);
	this.children.add(e);
	this.children.add(s);
    }

    @Override
    public String toString() {
        return "Until Statement";
    }
}

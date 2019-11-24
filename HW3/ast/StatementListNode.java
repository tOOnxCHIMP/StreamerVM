/**
 * This class represents a Statement List in the AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class StatementListNode extends ASTNode {
    /**
     * An empty statement list.
     */
    public StatementListNode() {
        super();
    }
    public StatementListNode(StatementNode s) {
        super();
	this.children.add(s);
    }

    public void addStatement(StatementNode s, int position) {
        this.children.add(position, s);
    }

    public void addStatement(StatementNode s) {
        this.children.add(s);
    }

    @Override
    public String toString() {
        return "Statement List";
    }
}

/**
 * This class represents a Statement List in the AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class ParamListNode extends ASTNode {
    /**
     * An empty statement list.
     */
    public ParamListNode(ParamNode e) {
        super();
	this.children.add(e);
    }

    public void addStatement(ParamNode s, int position) {
        this.children.add(position, s);
    }

    public void addStatement(ParamNode s) {
        this.children.add(s);
    }

    @Override
    public String toString() {
        return "Parameter List";
    }
}

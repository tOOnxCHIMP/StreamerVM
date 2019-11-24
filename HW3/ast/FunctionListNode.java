/**
 * This class represents a Function List in the AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class FunctionListNode extends ASTNode {
    /**
     * An empty function list.
     */
    public FunctionListNode() {
        super();
    }

    public void addStatement(FunctionNode s, int position) {
        this.children.add(position, s);
    }

    public void addStatement(FunctionNode s) {
        this.children.add(s);
    }

    @Override
    public String toString() {
        return "Function List";
    }
}

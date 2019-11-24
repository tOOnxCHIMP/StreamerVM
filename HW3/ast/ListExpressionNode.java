/**
 * This class represents a Statement List in the AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class ListExpressionNode extends ExpressionNode {
    /**
     * An empty statement list.
     */
    public ListExpressionNode(ExpressionNode e1) {
        super();
        this.children.add(e1);
    }
    public ListExpressionNode() {
        super();
      
    }

    public void addStatement(ExpressionNode s, int position) {
        this.children.add(position, s);
    }

    public void addStatement(ExpressionNode s) {
        this.children.add(s);
    }

    @Override
    public String toString() {
        return "Expression List";
    }
}

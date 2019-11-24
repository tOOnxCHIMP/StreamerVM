import java_cup.runtime.*;

/**
 * This class represents an assignment expression in the AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class FunctionNode extends ExpressionNode {
    private String id;
    private StatementListNode e;
    private ParamListNode p ;

    public FunctionNode()
    {
	super();
    }

    public FunctionNode(String id, StatementListNode e, ParamListNode p, TypeNode t) {
        super();
        this.id = id;
	this.children.add(t);
	this.children.add(p);
        this.children.add(e);
	
    }

    @Override
    public String toString() {
        return "Function declaration: " + this.id;
    }
}

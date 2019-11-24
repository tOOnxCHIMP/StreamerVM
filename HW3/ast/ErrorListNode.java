/**
 * This class represents a Statement List in the AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class ErrorListNode extends StatementNode {
    StatementListNode s1;
/**
     * An empty statement list.
     */
    public ErrorListNode(StatementListNode s1) {
        super();
        this.s1 = s1;
	this.children.add(s1);
    }
    public ErrorListNode() {
        super();
        
    }



    @Override
    public String toString() {
        return "Error Statement" ;
    }
}

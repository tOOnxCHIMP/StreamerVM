/**
 * This class represents a statement that is a declaration of a variable.
 *
 * @author Peter Ohmann + <your name here>
 */
public class WriteStatementNode extends StatementNode {
    private TypeNode varType;
    private String varName;

    /**
     * Just a plain declaration.
     * For example:  num myVal;
     */
    public WriteStatementNode(ExpressionNode type, ExpressionNode varName) {
        super();
      
        this.children.add(type);
	this.children.add(varName);
    }



    @Override
    public String toString() {
        return "File Write Statement ";
    }
}

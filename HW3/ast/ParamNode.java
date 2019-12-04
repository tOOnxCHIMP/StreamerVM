import java_cup.runtime.*;

/**
 * This class represents an assignment expression in the AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class ParamNode extends ExpressionNode {
    private String id;

    public ParamNode(String id, TypeNode e) {
        super();
        this.id = id;
        this.children.add(e);
    }
    public ParamNode() {
        super();

    }

    public String getValue1(){
     return ""; 
    }
    
    @Override
    public String toString() {
        return "Parameter: " + this.id;
    }
}

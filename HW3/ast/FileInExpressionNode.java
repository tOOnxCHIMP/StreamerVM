import java_cup.runtime.*;

/**
 * This class represents an assignment expression in the AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class FileInExpressionNode extends AssignExpressionNode {
    private String id;

    public FileInExpressionNode(String i,  ExpressionNode e) {
 super(i, e);
  this.id = i;
       

    }

    public String getValue1(){
     return this.id; 
    }
    
    @Override
    public String toString() {
        return "File Read into variable: " + this.id ;
    }
}

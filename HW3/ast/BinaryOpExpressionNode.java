/**
 * This class represents a binary operation (such as plus, minus, etc.) in the
 * AST.
 *
 * @author Peter Ohmann + <your name here>
 */
public class BinaryOpExpressionNode extends ExpressionNode {
    private ExpressionNode left;
    private ExpressionNode right;
    private String operator;

    /**
     * Represent an infix binary operator; that is "left op right".
     */
    public BinaryOpExpressionNode(ExpressionNode left,
    ExpressionNode right,
                                   String op) {
        super();
        this.right = right;
        this.left = left;
        this.operator = op;
        this.children.add(left);
        this.children.add(right);
    }
    
    public String getLeft(){
      if(this.left instanceof IdExpressionNode){
       return ((IdExpressionNode) this.left).getValue1(); 
      }
      else{
       return ((NumExpressionNode) this.left).getValue1(); 
      }
    }
    
    public ExpressionNode getLeft1(){
       return this.left; 
    }
    
      public ExpressionNode getRight1(){
       return this.right; 
    }
    
    public String getRight(){
      if(this.right instanceof IdExpressionNode){
       return ((IdExpressionNode) this.right).getValue1(); 
      }
      else{
       return ((NumExpressionNode) this.right).getValue1(); 
      }
    }
    
    public String getValue1(){
     return this.operator; 
    }

    @Override
    public String toString() {
        return "Binary operator '" + this.operator + "'";
    }
}

import java.util.HashMap;

public class StreamerVM
{
  
  private static HashMap<String, String> st = new HashMap<String, String>();
  ASTNode chil;
  
  public StreamerVM(ASTNode node)
  {
    System.out.println("In Here");
    this.printchil(node);
    
  }
  public static void main(String[] args)
  {
    
  }
  
  public static void printchil(ASTNode chilhere)
  {
    for(ASTNode current: chilhere.childrenIter())
    {
      if(current instanceof PrintStatementNode)
      {
        if(current.children.get(0) instanceof IdExpressionNode){
          System.out.println(st.get(((IdExpressionNode) current.children.get(0)).getValue1()));
        }
        else if(current.children.get(0) instanceof BinaryOpExpressionNode){
          System.out.println(evaluate(current)); 
        }
        else if(current.children.get(0) instanceof QstringExpressionNode){
         System.out.println(((QstringExpressionNode) current.children.get(0)).getValue1()); 
        }
        else{
          System.out.println(((PrintStatementNode) current).printOne());
        }
      }
      else if(current instanceof AssignExpressionNode)
      {
        if(current.children.get(0) instanceof BinaryOpExpressionNode){
          evaluateAssign(current);
        }
        else{
          st.put(((AssignExpressionNode) current).getID(), ((ExpressionNode) current.children.get(0)).getValue1());
        }
//              for(String input:st.keySet())
//               {
//                System.out.println("" + st.get(input));
//               }
      }
      else
      {
        printchil(current);
      }
    }
  }
  
  private static Double evaluate1(ASTNode current){
     Double left, right;
    if(current.children.get(0) instanceof NumExpressionNode){
      left = Double.parseDouble(((BinaryOpExpressionNode) current).getLeft()); 
    }
    else if(current.children.get(0) instanceof BinaryOpExpressionNode){
      left = evaluate1(((BinaryOpExpressionNode) current).getLeft1());
    }
    else{
      left = Double.parseDouble(st.get(((BinaryOpExpressionNode) current).getLeft())); 
    }
    if(current.children.get(1) instanceof NumExpressionNode){
      right = Double.parseDouble(((BinaryOpExpressionNode) current).getRight()); 
    }
    else if(current.children.get(1) instanceof BinaryOpExpressionNode){
      right = evaluate1(((BinaryOpExpressionNode) current).getRight1());
    }
    else{
      right = Double.parseDouble(st.get(((BinaryOpExpressionNode) current).getRight())); 
    }
    
    String op = ((BinaryOpExpressionNode) current).getValue1();
    
    if(op.compareTo("+") == 0){
      return left + right;
    }
    else if(op.compareTo("-") == 0){
      return left - right;
    }
    else if(op.compareTo("*") == 0){
      return left * right;
    }
    else if(op.compareTo("/") == 0){
      return left / right;
    }
    else if(op.compareTo("%") == 0){
      return left % right;
    } 
    else{
      return null; 
    }
  }
  
  private static Double evaluate(ASTNode current){
    Double left, right;
    if(current.children.get(0).children.get(0) instanceof NumExpressionNode){
      left = Double.parseDouble(((BinaryOpExpressionNode) current.children.get(0)).getLeft()); 
    }
    else if(current.children.get(0).children.get(0) instanceof BinaryOpExpressionNode){
      left = evaluate1(((BinaryOpExpressionNode) current.children.get(0)).getLeft1());
    }
    else{
      left = Double.parseDouble(st.get(((BinaryOpExpressionNode) current.children.get(0)).getLeft())); 
    }
    if(current.children.get(0).children.get(1) instanceof NumExpressionNode){
      right = Double.parseDouble(((BinaryOpExpressionNode) current.children.get(0)).getRight()); 
    }
    else if(current.children.get(0).children.get(1) instanceof BinaryOpExpressionNode){
      right = evaluate1(((BinaryOpExpressionNode) current.children.get(0)).getRight1());
    }
    else{
      right = Double.parseDouble(st.get(((BinaryOpExpressionNode) current.children.get(0)).getRight())); 
    }
    
    String op = ((BinaryOpExpressionNode) current.children.get(0)).getValue1();
    
    if(op.compareTo("+") == 0){
      return left + right;
    }
    else if(op.compareTo("-") == 0){
      return left - right;
    }
    else if(op.compareTo("*") == 0){
      return left * right;
    }
    else if(op.compareTo("/") == 0){
      return left / right;
    }
    else if(op.compareTo("%") == 0){
      return left % right;
    } 
    else{
      return null; 
    }
  }
  private static void evaluateAssign(ASTNode current){
      st.put(((AssignExpressionNode) current).getID(), "" + evaluate(current));
  }
}

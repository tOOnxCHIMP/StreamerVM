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
  
  public static  void printchil(ASTNode chilhere)
  {
    for(ASTNode current: chilhere.childrenIter())
    {
      if(current instanceof PrintStatementNode)
      {
        if(current.children.get(0) instanceof IdExpressionNode){
          System.out.println(st.get(((IdExpressionNode) current.children.get(0)).getValue1()));
        }
        else if(current.children.get(0) instanceof BinaryOpExpressionNode){
         evaluatePrint(current); 
        }
        else{
          System.out.println(((PrintStatementNode) current).printOne());
        }
      }
      else if(current instanceof AssignExpressionNode)
      {
        if(current.children.get(0) instanceof BinaryOpExpressionNode){
          evaluate(current);
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
  
  private static void evaluate(ASTNode current){
          Double left, right;
          if(current.children.get(0).children.get(0) instanceof NumExpressionNode){
            left = Double.parseDouble(((BinaryOpExpressionNode) current.children.get(0)).getLeft()); 
          }
          else{
            left = Double.parseDouble(st.get(((BinaryOpExpressionNode) current.children.get(0)).getLeft())); 
          }
          if(current.children.get(0).children.get(1) instanceof NumExpressionNode){
            right = Double.parseDouble(((BinaryOpExpressionNode) current.children.get(0)).getRight()); 
          }
          else{
            right = Double.parseDouble(st.get(((BinaryOpExpressionNode) current.children.get(0)).getRight())); 
          }
          
          String op = ((BinaryOpExpressionNode) current.children.get(0)).getValue1();
          
          if(op.compareTo("+") == 0){
            st.put(((AssignExpressionNode) current).getID(), "" + (left + right));
          }
          else if(op.compareTo("-") == 0){
            st.put(((AssignExpressionNode) current).getID(), "" + (left - right));
          }
          else if(op.compareTo("*") == 0){
            st.put(((AssignExpressionNode) current).getID(), "" + (left * right));
          }
          else if(op.compareTo("/") == 0){
            st.put(((AssignExpressionNode) current).getID(), "" + (left / right));
          }
          else if(op.compareTo("%") == 0){
            st.put(((AssignExpressionNode) current).getID(), "" + (left % right));
          } 
  }
  private static void evaluatePrint(ASTNode current){
          Double left, right;
          if(current.children.get(0).children.get(0) instanceof NumExpressionNode){
            left = Double.parseDouble(((BinaryOpExpressionNode) current.children.get(0)).getLeft()); 
          }
          else{
            left = Double.parseDouble(st.get(((BinaryOpExpressionNode) current.children.get(0)).getLeft())); 
          }
          if(current.children.get(0).children.get(1) instanceof NumExpressionNode){
            right = Double.parseDouble(((BinaryOpExpressionNode) current.children.get(0)).getRight()); 
          }
          else{
            right = Double.parseDouble(st.get(((BinaryOpExpressionNode) current.children.get(0)).getRight())); 
          }
          
          String op = ((BinaryOpExpressionNode) current.children.get(0)).getValue1();
          
          if(op.compareTo("+") == 0){
            System.out.println(left + right);
          }
          else if(op.compareTo("-") == 0){
             System.out.println(left - right);
          }
          else if(op.compareTo("*") == 0){
             System.out.println(left * right);
          }
          else if(op.compareTo("/") == 0){
             System.out.println(left / right);
          }
          else if(op.compareTo("%") == 0){
             System.out.println(left % right);
          } 
  }
}

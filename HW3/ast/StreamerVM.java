import java.util.HashMap;

public class StreamerVM
{
  
  private static HashMap<String, Double> st = new HashMap<String, Double>();
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
         System.out.println(((PrintStatementNode) current).printOne());
     }
            else if(current instanceof AssignExpressionNode)
            {
               st.put(((AssignExpressionNode) current).getValue1(), ((NumExpressionNode) current.children.get(0)).getValue());
               
              for(String input:st.keySet())
               {
                System.out.println("" + st.get(input));
               }
            }
     else
      {
   printchil(current);
      }
         }
    }
}

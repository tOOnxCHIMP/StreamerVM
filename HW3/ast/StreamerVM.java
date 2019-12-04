public class StreamerVM
{
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
	       	       if(current != null)
		   {
		       printchil(current);
		   }
	       System.out.println(current.toString());
	   }
    }
}

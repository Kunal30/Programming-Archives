
public class Main {
  
	public static void main(String args[])
	{
		BST bst=new BST();
    	bst.insert(123);
		bst.insert(45);
	    bst.insert(1331);
	    bst.insert(31);
	    bst.insert(13);
	    bst.insert(131);
	    System.out.println("Inversions= "+ bst.levelTraversalInversion());
		}
}
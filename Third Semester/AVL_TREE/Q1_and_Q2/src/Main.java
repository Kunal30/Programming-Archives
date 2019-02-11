
public class Main {
  
	public static void main(String args[])
	{
	   AVL bst=new AVL();
	    bst.AVL_Insert(123);
		bst.AVL_Insert(45);
		bst.AVL_Insert(50);
		bst.AVL_Insert(1331);
		bst.AVL_Insert(13);
		bst.AVL_Insert(131);
		bst.AVL_Insert(31);
		bst.AVL_Insert(8);
		bst.AVL_Insert(22);
	    bst.Level_Order_Traversal(bst.root);
		}
}
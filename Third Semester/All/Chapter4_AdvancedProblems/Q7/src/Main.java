
public class Main {
  
	public static void main(String args[])
	{
		BST bst=new BST();
		bst.insert(123);
		bst.insert(45);
		bst.insert(1331);
		bst.insert(13);
		bst.insert(131);
		bst.insert(31);
		//	System.out.println(bst.root.left.left.key);	
		bst.Level_Order_Traversal(bst.root);
//		System.out.println(bst.totalnodes);
		}
}
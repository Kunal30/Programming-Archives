
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
	//	bst.delete(31);
	//	bst.delete(13);
	//	bst.inorder_tree_walk(bst.root);
		System.out.println(bst.getSuccessor(bst.root.right).key);
		//System.out.println(bst.tree_search(bst.root.right,13).key);
		//System.out.println(bst.tree_minimum(bst.root).key);
		}
}

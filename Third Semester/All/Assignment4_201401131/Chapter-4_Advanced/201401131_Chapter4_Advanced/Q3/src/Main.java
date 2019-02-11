public class Main {
	public static void main(String[] args)
	{
		BST bst = new BST();
		bst.insert(50);		
		bst.insert(40);		
		bst.insert(30);
		bst.insert(20);
		bst.insert(60);
		bst.insert(70);
		bst.initializeSubtreeSize(bst.root);
		bst.getLinks(bst.root);
	}
}
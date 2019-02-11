public class Node {	
	Node parent;
	Node left;
	Node right;
	int key,depth,size;
	
	Node(int x)
	{
		key = x;
		parent = left = right = null;
	}
}
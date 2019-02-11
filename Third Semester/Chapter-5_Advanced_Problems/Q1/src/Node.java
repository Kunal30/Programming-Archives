public class Node {	
	Node parent;
	Node left;
	Node right;
	int key,depth;
	
	Node(int x)
	{
		key = x;
		parent = left = right = null;
	}
}

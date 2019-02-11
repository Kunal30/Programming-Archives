public class BST {
Node root;
public BST()
{
	root=null;
}
public Node tree_search(Node x,int k)
{
	if(x==null || k==x.key)
		return x;
	if(k<x.key)
		return tree_search(x.left,k);
	else
		return tree_search(x.right,k);
}
public Node tree_minimum(Node x)
{
	while(x.left!=null)
		x=x.left;
	return x;
}
public Node tree_maximum(Node x)
{
	while(x.right!=null)
		x=x.right;
	return x;
}
public Node getSuccessor(Node x){
	Node successsor =null;
	Node successsorParent =null;
	Node current = x.right;
	while(current!=null){
		successsorParent = successsor;
		successsor = current;
		current = current.left;
	}
	//check if successor has the right child, it cannot have left child for sure
	// if it does have the right child, add it to the left of successorParent.
//	successsorParent
	if(successsor!=x.right){
		successsorParent.left = successsor.right;
		successsor.right = x.right;
	}
	return successsor;
}
public void insert(int id){
	Node newNode = new Node(id);
	if(root==null){
		root = newNode;
		return;
	}
	Node current = root;
	Node parent = null;
	while(true){
		parent = current;
		if(id<current.key){				
			current = current.left;
			if(current==null){
				parent.left = newNode;
				return;
			}
		}
		else
		{
			current = current.right;
			if(current==null){
				parent.right = newNode;
				return;
			}
		}
	}
}
public void inorder_tree_walk(Node root){
	if(root!=null){
		inorder_tree_walk(root.left);
		System.out.print(" " + root.key);
		inorder_tree_walk(root.right);
	}
}
public boolean delete(int id){
	Node parent = root;
	Node current = root;
	boolean isLeftChild = false;
	while(current.key!=id){
		parent = current;
		if(current.key>id){
			isLeftChild = true;
			current = current.left;
		}else{
			isLeftChild = false;
			current = current.right;
		}
		if(current ==null){
			return false;
		}
	}
	//if i am here that means we have found the node
	//Case 1: if node to be deleted has no children
	if(current.left==null && current.right==null){
		if(current==root){
			root = null;
		}
		if(isLeftChild ==true){
			parent.left = null;
		}else{
			parent.right = null;
		}
	}
	//Case 2 : if node to be deleted has only one child
	else if(current.right==null){
		if(current==root){
			root = current.left;
		}else if(isLeftChild){
			parent.left = current.left;
		}else{
			parent.right = current.left;
		}
	}
	else if(current.left==null){
		if(current==root){
			root = current.right;
		}else if(isLeftChild){
			parent.left = current.right;
		}else{
			parent.right = current.right;
		}
	}else if(current.left!=null && current.right!=null){
		
		//now we have found the minimum element in the right sub tree
		Node successor	 = getSuccessor(current);
		if(current==root){
			root = successor;
		}else if(isLeftChild){
			parent.left = successor;
		}else{
			parent.right = successor;
		}			
		successor.left = current.left;
	}		
	return true;		
}
}

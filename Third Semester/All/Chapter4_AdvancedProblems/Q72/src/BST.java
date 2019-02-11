import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class BST {
Node root;
int ans=0;
int parentLevel=0;
Node found=null;
int totalnodes=0;
public BST()
{
	root=null;
}
public void insert(int data)
{
	Node newNode=new Node(data);
	Node x = root;
	if(root == null)
	{
		root = newNode;
		return;
	}
	
	while(true)
	{
		if(x.level % 2 == 0)
		{
			if(x.key > newNode.key && x.left != null)
			{
				x = x.left;
			}
			else if(x.key < newNode.key && x.right!= null)
			{
				x = x.right;
			}
			else
				break;
		}
		else
		{
			if(x.key> newNode.key && x.right!= null)
			{
				x = x.right;
			}
			else if(x.key< newNode.key&& x.left!= null)
			{
				x = x.left;
			}
			else
				break;
		
		}
	}
	newNode.parent = x;
	newNode.level = x.level + 1;
	
	if(x.level % 2 == 0)
	{
		if(x.key > newNode.key)
		{
			 x.left = newNode;
		}
		else
		{
			x.right = newNode;
		}
	}
	else
	{
		if(x.key > newNode.key)
		{
			 x.right = newNode;
		}
		else
		{
			x.left = newNode;
		}
	}
}
public Node treeSuccessor(int x)
{
	Node y = search(root,x);
	if(y.right != null && y.level % 2 == 0)
	{
		return treeMin(y.right);
	}
	else if(y.left != null && y.level % 2 != 0)
	{
		return treeMin(y.left);
	}
	while(y != root && ((y == y.parent.right && y.parent.level % 2 == 0) || (y == y.parent.left && y.parent.level % 2 != 0)))
	{
		y = y.parent;
	}
	return y.parent;
}

public Node search(Node x,int key)
{
	if(x == null)
		return x;
	if(x.key == key)
		return x;
	else if(x.level % 2 == 0)
	{
		if(x.key > key)	
		{
			return search(x.left,key);
		}
		else
			return search(x.right,key);
	}
	else
	{
		if(x.key > key)	
		{
			return search(x.right,key);
		}
		else
			return search(x.left,key);
	}
}

public Node treeMax(Node x)
{
	
	if((x.right == null && x.level % 2 == 0) || (x.left == null && x.level % 2 != 0))
		return x;
	else
	{
		if(x.level % 2 == 0)
			return treeMax(x.right);
		else
			return treeMax(x.left);
	}
}

public Node treeMin(Node x)
{
	if((x.left == null && x.level % 2 == 0) || (x.right == null && x.level % 2 != 0))
		return x;
	else
	{
		if(x.level % 2 == 0)
			return treeMin(x.left);
		else
			return treeMin(x.right);
	}
}

public void Level_Order_Traversal(Node root)
{
	Queue Q=new LinkedList();
	Node x=root;
	Q.add(x);
	while(!Q.isEmpty())
	{
		Node u=(Node) Q.remove();
		if(u.left!=null)
			Q.add(u.left);
		
			if(u.right!=null)
				Q.add(u.right);
		System.out.print(" -> "+u.key);
	}
	
}
public int depth(Node x,int key)
{
	int depth = 0;
	while(x.key!= key)
	{
		if(x.key > key)
		{
			x = x.left;
		}
		else
		{
			x = x.right;
		}
		depth++;
	}
	return depth;
}

public int height(int key)
{
	Node x=search(root,key);
	int height_counter=height_recursive(x);
	return height_counter;
}
public int height_recursive(Node x)
{
   if(x==null)
	   return -1;
   else
   {
	   int leftsize=height_recursive(x.left);
	   int rightsize=height_recursive(x.right);
	   
	 if(leftsize>rightsize)
		   return leftsize+1;
	 else
		 return rightsize+1;
   }
   }
public int subtree(int key)
{
	Node x=search(root,key);
	ans=find_nodes_of_subtree(x.key);
	return ans;
}
public int find_nodes_of_subtree(int key)
{
	Node x=search(root,key);
	int total=0;
	 if(x.left!=null)
		{
		 total++;
		 find_nodes_of_subtree(x.left.key);
		}
	 if(x.right!=null)
		{
		 total++;
		 find_nodes_of_subtree(x.right.key);
		}
	   ans=ans+total;
	   return ans;
}
public void preorder_iterative(Node root)
{
	Node curr=root;
	Stack<Node> stack=new Stack<Node>();
	while(true){
        if(curr!=null){
            System.out.println(curr.key+" ");
            if(curr.right!=null){
                stack.push(curr.right);
            }
            curr = curr.left;
        }
        else{
            if(!stack.isEmpty()){
                curr = stack.pop();
            }
            else{
                break;
            }
        }
    }
}
public void postorder_iterative(Node root)
{
	
	Stack<Node> mystack=new Stack<Node>();
	Node current=root;
	mystack.push(current);
	while(!mystack.isEmpty())
	{
	Node next=mystack.peek();
	if(next.left==null && next.right==null ||next.left==root||next.right==root)
	{
	mystack.pop();
	System.out.print(next.key+"->");
	root=next;
	}
	else
	{
	if(next.right!=null)
	mystack.push(next.right);
	if(next.left!=null)
	mystack.push(next.left);
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
public void preorder_tree_walk(Node root){
	if(root!=null){
		System.out.print(" " + root.key);
		inorder_tree_walk(root.left);
		inorder_tree_walk(root.right);
	}
}
public void postorder_tree_walk(Node root){
	if(root!=null){
		inorder_tree_walk(root.left);
		inorder_tree_walk(root.right);
		System.out.print(" " + root.key);
	}
}
public boolean delete(int id){
	totalnodes--;
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
		
	
		Node successor	 = treeSuccessor(current.key);
		if(current==root){
			root = successor;
		}else if(isLeftChild){
			parent.left = successor;
		}else{
			parent.right = successor;
		}			
		successor.left = current.left;
		if(successor.parent==current)
		successor.parent.left=successor.right;		
	}		
	return true;		
}
}
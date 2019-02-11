import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class AVL {
Node root;
int ans=0;
public AVL()
{
	root=null;
}
public void AVL_Delete(int value)
{
	delete(value);
}
public void AVL_Insert(int value)
{
	int isLeftChild=-1;
	insert(value);
	Node x=tree_search(root,value);
	if(x!=root&& (root.left!=null && root.right!=null))
	{		
	if(x==x.parent.left)
		isLeftChild=1;
	else
		isLeftChild=0;
	Node nodeToBeRotated= x.parent.parent;
	while((Math.abs(height(root.left.key)-height(root.right.key))>1))
	{
		if(isLeftChild==1)
		{
			if(nodeToBeRotated==root)
			{
				if(x.key<root.key)
					rightRotate(nodeToBeRotated);
				else
					leftRotate(nodeToBeRotated);
			}
		if(nodeToBeRotated.left!=null&&nodeToBeRotated.right!=null)
			nodeToBeRotated=nodeToBeRotated.parent;
		else
			
		if(nodeToBeRotated.right!=null&&nodeToBeRotated.left==null)
			nodeToBeRotated=nodeToBeRotated.parent;
		else
			
		if(nodeToBeRotated.right==null&&nodeToBeRotated.left!=null)
             rightRotate(nodeToBeRotated);		
	    }
		else if(isLeftChild==0)
		{
			if(nodeToBeRotated==root)
			{
				if(x.key<root.key)
					rightRotate(nodeToBeRotated);
				else
					leftRotate(nodeToBeRotated);
			}
		if(nodeToBeRotated.left!=null&&nodeToBeRotated.right!=null)
			nodeToBeRotated=nodeToBeRotated.parent;
		if(nodeToBeRotated.right!=null&&nodeToBeRotated.left==null)			
		    leftRotate(nodeToBeRotated);
		if(nodeToBeRotated.right==null&&nodeToBeRotated.left!=null)
			nodeToBeRotated=nodeToBeRotated.parent;

					}
	}
	}		
	}
public void leftRotate(Node node)
{
	if(node.right!=null)
	{
    Node x=node;
	Node y=x.right;
	x.right=y.left;
	if(y.left!=null)
		y.left.parent=x;
	y.parent=x.parent;
	if(x.parent==null)
		root=y;
	else if(x==x.parent.left)
		x.parent.left=y;
	else
		x.parent.right=y;
	y.left=x;
	x.parent=y;
	}	
}
public void rightRotate(Node node)
{
	if(node.left!=null)
	{
    Node x=node;
	Node y=x.left;
	x.left=y.right;
	if(y.right!=null)
		y.right.parent=x;
	y.parent=x.parent;
	if(x.parent==null)
		root=y;
	else if(x==x.parent.right)
		x.parent.right=y;
	else
		x.parent.left=y;
	y.right=x;
	x.parent=y;
	}	
}
public void Level_Order_Traversal(Node root)
{
	Queue Q=new LinkedList();
	Node x=root;
	Q.add(x);
	while(!Q.isEmpty())
	{
		Node u=(Node)Q.poll();
		if(u.left!=null)
			Q.add(u.left);
			if(u.right!=null)
				Q.add(u.right);
		System.out.print(" -> "+u.key);
	}
	
}
public void Zig_Zag_Traversal(Node root)
{
	Node x=root;
	Stack<Node> S_even=new Stack<Node>();
	Stack<Node> S_odd=new Stack<Node>();
	S_even.push(x);
	Stack currstack=S_even;
	Stack otherstack=S_odd;
	while(!S_odd.isEmpty()||!S_even.isEmpty())
	{
		
		if(currstack==S_even)
		{
			Node u=(Node) S_even.pop();
			System.out.println(" -> "+u.key);
			if(u.left!=null)
			S_odd.push(u.left);
			if(u.right!=null)
			S_odd.push(u.right);
		}
		else
		{
			Node u=(Node) S_odd.pop();
			System.out.println(" -> "+u.key);
			if(u.right!=null)
			S_even.push(u.right);
			if(u.left!=null)
			S_even.push(u.left);
		}
		
		if(currstack.isEmpty())
		{
			Stack temp=currstack;
			currstack=otherstack;
			otherstack=temp;
		}
	}
}
public void depth(int key)
{
	int depth_counter=0;
	Node x=tree_search(root,key);
	while(x!=root)
		{
		 depth_counter++;
		 x=x.parent;
		}
	System.out.println(depth_counter);
}
public int height(int key)
{
	Node x=tree_search(root,key);
	int height_counter=height_recursive(x);
	return (height_counter);
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
public void subtree(int key)
{
	Node x=tree_search(root,key);
	ans=find_nodes_of_subtree(x.key);
	System.out.println(ans);
}
public int find_nodes_of_subtree(int key)
{
	Node x=tree_search(root,key);
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
	if(x.right!=null)
		return tree_minimum(x.right);
	else
		while(x==x.parent.right)
			x=x.parent;
	return x.parent;
}
public Node getPredecessor(Node x){
	if(x.left!=null)
		return tree_maximum(x.left);
	else
		while(x==x.parent.left)
			x=x.parent;
	return x.parent;
}

public void insert(int id){
	Node newNode = new Node(id);
	if(root==null){
		root = newNode;
		return;
	}
	Node current = root;
	Node parent1 = null;
	while(true){
		parent1 = current;
		if(id<current.key){				
			current = current.left;
			if(current==null){
				parent1.left = newNode;
				newNode.parent=parent1;
				return;
			}
		}
		else{
			current = current.right;
			if(current==null){
				parent1.right = newNode;
				newNode.parent=parent1;
				return;
			}
			
		}
		
	}
}
public void inorder_iterative(Node root)
{
	Node x=tree_minimum(root);
	System.out.println(x.key);
	while(x!=null)
	{   
		x=getSuccessor(x);
		System.out.println(x.key);
	}
}
public void preorder_iterative(Node root)
{
	Node curr=root;
	String vertical="down";
	String horizontal="left";
	while(curr!=null)
	{
		if(vertical.equalsIgnoreCase("down"))
		{
			System.out.println(curr.key);
			if(curr.left!=null)
			{
				horizontal="left";
				curr=curr.left;
			}
			else if(curr.right!=null)
			{
				horizontal="right";
				curr=curr.right;
			}
			else
			{
				vertical="up";
				if(curr==curr.parent.left)
					horizontal="left";
				else
					horizontal="right";
			}
		}
	
		else	if(vertical.equals("up")&&horizontal.equals("left"))
			{  
				if(curr.right!=null)
				{
					vertical="down";
					horizontal="right";
				     curr=curr.right;
				}
				else
				{
					if(curr==curr.parent.left)
						horizontal="left";
					else
						horizontal="right";
					curr=curr.parent;
				}
				
			}
		
		else		if(vertical.equals("up")&&horizontal.equalsIgnoreCase("right"))
				{
					if(curr==curr.parent.left)
						horizontal="left";
					else
						horizontal="right";
					curr=curr.parent;
				}
	}
}
public void postorder_iterative(Node root)
{
		Node curr=root;
		String vertical="down";
		String horizontal="left";
		while(curr!=null)
		{
			if(vertical.equalsIgnoreCase("down"))
			{
				
				if(curr.left!=null)
				{
					horizontal="left";
					curr=curr.left;
					continue;
				}
				 if(curr.right!=null)
				{
					horizontal="right";
					curr=curr.right;
					continue;
				}
			
				
				
					vertical="up";
					if(curr==curr.parent.left)
						horizontal="left";
					else
						horizontal="right";	
			}
		
			else
				{
				if(vertical=="up"&&horizontal=="left")
				{
					if(curr.right!=null)
					{
						vertical="down";
						horizontal="right";
					     curr=curr.right;
					     continue;
					}
					else 
					{
						System.out.println(curr.key);
						}
					
					
						if(curr==curr.parent.left)
							horizontal="left";
						else
							horizontal="right";
						curr=curr.parent;
					
					
				}
			
			else	
				if(vertical=="up"&&horizontal=="right")
					{
					System.out.println(curr.key);
						if(curr.parent!=null&&curr==curr.parent.left)
							horizontal="left";
						else
							horizontal="right";
						curr=curr.parent;
						//if(curr.right!=null)
						//System.out.println(curr.key);
						
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
public void preorder_tree_walk(Node root){
	if(root!=null){
		System.out.print(" " + root.key);
		preorder_tree_walk(root.left);
		preorder_tree_walk(root.right);
	}
}
public void postorder_tree_walk(Node root){
	if(root!=null){
		postorder_tree_walk(root.left);
		postorder_tree_walk(root.right);
		System.out.print(" " + root.key);
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
		
	
		Node successor	 = getSuccessor(current);
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
import java.util.*;
public class BST {
	Node root;
	int size=0;
	public void leftRotate(Node x)
	{
		
	}
	public void rightRotate(Node x)
	{
		
	}
	public void insertavl(int key)
	{
		Node newNode=new Node(key);
		insert(newNode);
		AVL(newNode.parent);
	}
	public void AVL(Node x)
	{
		if(x==null)
			return;
		int heightdiff= height(x.left)-height(x.right);
		if(heightdiff==0)
			return;
		else if(heightdiff>1||heightdiff<-1)
		{
		  if(heightdiff>1)
		  {
			  Node y=x.left;
			  int heightdiffy=height(y.left)-height(y.right);
			  if(heightdiffy>=-1)
			  {
				  rightRotate(x);
			  }
			  else
			  {
				  leftRotate(y);
				  rightRotate(x);
			  }
		  }
		  else if(heightdiff<-1)
		  {
			  Node y=x.right;
			  int heightdiffy=height(y.left)-height(y.right);
			  if(heightdiffy<=-1)
			  {
				  leftRotate(x);
			  }
			  else
			  {
				  rightRotate(y);
				  leftRotate(x);
			  }  
		  }
			return;
		}
		else
		{
			AVL(x.parent);
		}
	}
	public void level_order()
	{
		Queue<Node> Q=new LinkedList<Node>();
		Q.add(root);
		while(!Q.isEmpty())
		{
			Node u=Q.remove();
			System.out.println(u.key);
			if(u.left!=null)
				Q.add(u.left);
			if(u.right!=null)
				Q.add(u.right);
		}
	}
	public int depth(Node x)
	{
		int depth=0;
		while(x!=root)
		{
			depth++;
			x=x.parent;
		}
		return depth;
	}
	public int height(Node x)
	{
		//Node x=search(root,key);
		return height_recursive(x);
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
		return subtreesizerec(x);
	}
	public int subtreesizerec(Node x)
	{
		if(x!=null)
		{
			subtreesizerec(x.left);
			size++;
			subtreesizerec(x.right);
		}
		return size;
	}
	public void zig_zag()
	{
		Node curr=root;
		Stack<Node> S_Even=new Stack<Node>();
		Stack<Node> S_Odd=new Stack<Node>();
		Stack currstack=S_Even;
		Stack otherstack=S_Odd;
		S_Even.push(curr);
		while(!S_Even.isEmpty()||!S_Odd.isEmpty())
		{
			if(currstack==S_Even)
			{
				Node u=S_Even.pop();
				System.out.println(u.key);
				if(u.left!=null)
					S_Odd.push(u.left);
				if(u.right!=null)
					S_Odd.push(u.right);
			}
			else
			{
				Node u2=S_Odd.pop();
				System.out.println(u2.key);
				if(u2.right!=null)
					S_Even.push(u2.right);
				if(u2.left!=null)
					S_Even.push(u2.left);
			}
			if(currstack.isEmpty())
			{
				Stack temp=currstack;
				currstack=otherstack;
				otherstack=temp;
			}
		}
	}
	public void insert(Node node)
	{
		//Node node=new Node(data);
		Node x=root;
		if(root==null)
			{
			root=node;
			return;
			}
		while((x.key>node.key && x.left!=null)||(x.key<node.key && x.right!=null))
		{
			if(x.key>node.key)
				x=x.left;
			else
				x=x.right;
		}
		node.parent=x;
		if(x.key<node.key)
			x.right=node;
		else
			x.left=node;
	}
	public void delete(int key)
	{
		
	}
	public Node Successor(int x)
	{
		Node y=search(root,x);
		if(y.right!=null)
		return treeMin(y.right);
		while(y!=root && y==y.parent.right )
			y=y.parent;
		return y.parent;
	}
	public Node treeMin(Node curr)
	{
		while(curr.left!=null)
			curr=curr.left;
		return curr;
	}
	public Node search(Node x,int key)
	{
		if(x==null)
			return x;
		if(key==x.key)
			return x;
		else
			if(key<x.key)
				return search(x.left,key);
			else
				return search(x.right,key);
		}
}
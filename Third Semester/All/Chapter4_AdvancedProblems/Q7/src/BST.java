import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class BST {
Node root;
int ans=0;
int totalnodes=0;
public BST()
{
	root=null;
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
public int depth(int key)
{
	int depth_counter=0;
	Node x=tree_search(root,key);
	while(x!=root)
		{
		 depth_counter++;
		 x=x.parent;
		}
	return (depth_counter);
}
public int height(int key)
{
	Node x=tree_search(root,key);
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
	Node x=tree_search(root,key);
	ans=find_nodes_of_subtree(x.key);
	return ans;
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
	totalnodes++;
	Node newNode = new Node(id);
	if(root==null){
		root = newNode;
		return;
	}
	Node current = root;
	Node parent1 = null;	
	while(true){
		if(depth(current.key)%2==0)
		{	
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
		else
		{
			parent1 = current;
			if(id>current.key){				
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
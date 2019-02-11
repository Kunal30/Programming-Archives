import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
	   BST bst=new BST();
   	    bst.insert(123);
		bst.insert(45);
	    bst.insert(1331);
	    bst.insert(31);
	    bst.insert(13);
	    bst.insert(131);
	    getLinks(bst);
}
   public static void getLinks(BST b1){
	   b1.setSizeInNodes(b1.root);
	   findLinks(b1,(int)((float)(b1.root.size)/3));  
   }
   public static void findLinks(BST b2,int n){
	   Node x=b2.root;
	   b2.setSizeInNodes(b2.root);
	   findLink(x,n);
	   Node head=f;
	   f=null;
	   if(head!=null){
		   if(head.getParent()!=null){
			   System.out.println("First Selection");
			   System.out.println(head.getData()+" "+head.getParent().getData());
			  if(head.getParent().getLeft()==head){
				  head.getParent().setleft(null);	  
			  }
			  else{
				   head.getParent().setright(null);
			  }
		   }
		   else{
			   System.out.println(head.getData()+" alone");
		   }
	   }
	   else{
		    System.out.println("No nodes in first one");
	   }
	   System.out.println("second selection");
	   x=b2.root;
	   b2.setSizeInNodes(b2.root);
	   findLink(x,n);
	   head=f;
	   f=null;
	   if(head!=null){ 
		   if(head.getParent()!=null){
			   System.out.println(head.getData()+" "+head.getParent().getData());
			  if(head.getParent().getLeft()==head){
				  head.getParent().setleft(null);
			  }
			  else{
				   head.getParent().setright(null);
			  }
		   }
		   else{
			   System.out.println(head.getData()+" alone ");
		   }
	   }
	   else{
		   System.out.println("no nodes in second tree");
	   }
   }
   static Node f=null;
   static int min=Integer.MAX_VALUE;
   public static void findLink(Node node,int n){
	   if(node==null){
		   return ;
	   }
	   else if(Math.abs(node.size-n)<=min){
		   f=node;
		   min=Math.abs(node.size-n);
	   }
		   findLink(node.left, n);
		   findLink(node.right, n);
   }
}
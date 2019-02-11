class Node{
	int key,level;
	Node left;
	Node right;
	Node parent;
	public Node(int key){
		this.key = key;
		left = null;
		right = null;
		parent=null;
	}
	  public void setleft(Node left){
		  this.left=left;
	  }
	  public void setright(Node right){
		  this.right=right;
	  }
	  public Node getParent(){
		  return parent;
	  }
	  public Node getLeft(){
		  return left;
	  }
	  public Node getRight(){
		  return right;
	  }
	  public void setdata(int T){
		  this.key=T;
	  }
	  public int getData(){
		  return key;
	  }
}
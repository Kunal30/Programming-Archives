class Node{
	int key;
	int height;
	Node left;
	Node right;
	Node parent;
	public Node(int key){
		this.key = key;
		left = null;
		right = null;
		parent=null;
	}
	 void setLeftChild(Node child) {
         if (child != null) {
             child.parent = this;
         }

         this.left = child;
     }

     void setRightChild(Node child) {
         if (child != null) {
             child.parent = this;
         }

         this.right = child;
     }
}
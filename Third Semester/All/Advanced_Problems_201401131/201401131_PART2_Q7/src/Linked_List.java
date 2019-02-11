public class Linked_List {
	 Node head;
	 Node tail;
     int listCount;
    public Linked_List() {
        head = new Node(null);
        tail=new Node(null);
        listCount = 0;
    }
    public void add(Object data)
    {
        Node Temp = new Node(data);
        Node Current = head;
        while (Current.next != null) {
            Current = Current.next;
        }
        Current.next=(Temp);
        Current.next.prev=Current;
        tail=Current.next;
        listCount++;
    }
    public Node get(int index)
    { 
        Node Current = head.next;
        for (int i = 1; i < index; i++) {
            if (Current.next == null)
                return null;
            Current = Current.next;
        }
      return Current;    
    }
    public void remove(int index)
    {
        Node Current = head;
        for (int i = 1; i < index; i++) {
            if (Current.next == null)
                return ;
            Current = Current.next;
        }
        Current.next=(Current.next.next);
        listCount--;
    }
    public int size()
    {
        return listCount;
    }
    public void printList()
    {
    	Node curr=head;
    	while(curr.next!=null)
    	{   if(curr.data!=null)
    		System.out.println(curr.data);
    		curr=curr.next;
    	}
    	if(curr.data!=null)
    	System.out.println(curr.data);
    	System.out.println();
    }
    public void reverseList(int []index)
    {
    	int i=0,j=index.length-1;
    	Node left=get(index[i]);
    	Node right=get(index[j]);
    	while((left!=right))
    	{   
      	if(index[i]!=index[j-1])
      	{
      		Node l1=left.prev;
    		Node l2=left.next;
    		Node r1=right.prev;
    		Node r2=right.next;
    		left.prev=r1;
    		left.next=r2;
    		right.next=l2;
    		right.prev=l1;   
      	}
      	else
      	{
      		Node l1=left.prev;
    		Node l2=left.next;
      		left.prev=right;
      		left.next=right.next;
      		right.next=left;
      		right.prev=l1;
      		if(left.equals(head.next)){
      			head.next=right;
      		}
      	}
    		if(left.prev!=null){
    			left.prev.next=left;
    		}
    		if(left.next!=null){
    		    left.next.prev=left;
    		}
    		if(right.prev!=null){
    			right.prev.next=right;
    		}
    		if(right.next!=null){
    		    right.next.prev=right;
    		}
    	   if(index.length%2==0 && i==j-1){
    		   break;                          		   
    	   }
    	   if(left==right)
    		   break;
    		left=get(index[++i]);
    		right=get(index[--j]);
    	}  
}
}
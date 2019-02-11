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
    	while(left!=right)
    	{   
    		
      		Node l1=left.prev;
    		Node l2=left.next;
    		Node r1=right.prev;
    		Node r2=right.next;
    		l1.next=right;
    		right.prev=l1;
    		r1.next=left;
    		right.next=l2;
    		left.prev=r1;
    		left.next=r2;
    		r2.prev=left;
    		l2.prev=right;
    		if(i==index.length-1||i>j)
    			break;
    		left=get(index[++i]);
    		right=get(index[--j]);		
    	}
    
}
}
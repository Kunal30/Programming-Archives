public class Linked_List {
	 Node head;
     int listCount;
    public Linked_List() {
        head = new Node(null);
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
        listCount++;
    }
    public void get(int index)
    { 
        Node Current = head.next;
        for (int i = 1; i < index; i++) {
            if (Current.next == null)
                return ;
            Current = Current.next;
        }
        System.out.println(Current.data);
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
    public Linked_List scanList(Object n)
    {   
    	Linked_List dummy=new Linked_List();
    	Node curr=head.next;
    	while(curr!=null)
    	{
    		if(n==curr.data)
    		dummy.add(curr);
    		
    		curr=curr.next;
    	}
    	return dummy;
    }
}
 
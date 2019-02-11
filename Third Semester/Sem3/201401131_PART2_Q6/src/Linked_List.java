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
    public void reverseList(int x,int y)
    {
    	int count=0,count2=0;
    	Node Current = head;
    	Node Current2=head;
    	Node Current3;
    	Node Current4,Current5;
    	while(count!=x-1)
    	{
    		Current=Current.next;
    	    count++;	
    	}    	
    	while(count2!=y)
    	{
    		Current2=Current2.next;
    	    count2++;	
    	}
    	Current3=Current2.next;
    	Current4=Current2;
    	Current5=Current.next;
    	while(Current2!=Current)
    	{
    		Node temp=Current2.next;
    		Current2.next=Current2.prev;
    		Current2.prev=temp;
    		Current2=Current2.next;
    	}
    	Current.next=Current4;
    	Current4.prev=Current;
    	Current5.next=Current3;
    }
}
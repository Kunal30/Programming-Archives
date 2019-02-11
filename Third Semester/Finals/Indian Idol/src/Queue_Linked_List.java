public class Queue_Linked_List {
	Participant head;
	int size=0;
	public Queue_Linked_List()
	{
		head=new Participant(null);
	}
public void add(Object obj)
{   
	Participant temp=new Participant(obj);
	Participant curr=head;
	while(curr.next!=null)
		curr=curr.next;
	curr.next=temp;
	size++;
}
public void remove(int index)
{
	Participant curr=head;
	for(int i=1;i<index;i++)
	{
		if(curr.next==null)
			return;
		curr=curr.next;
	}
	curr.next=curr.next.next;
	size--;
}
public Object get(int index)
{
	Participant curr=head.next;
	for(int i=1;i<index;i++)
	{
		if(curr.next==null)
			return 0;
		curr=curr.next;
	}
	return curr.rn;
}
}

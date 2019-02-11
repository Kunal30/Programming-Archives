public class Linked_List {
Node head;
Node tail;
public Linked_List() {
    head = new Node(0);
    tail = new Node(0);
}
public void add(int data)
{
	Node newNode=new Node(data);
	Node curr=head;
	while(curr.next!=null)
		curr=curr.next;
	 curr.next=newNode;
	 newNode.prev=curr;
	tail=curr.next;
}
public void get(int index)
{
	Node curr=head;
	for(int i=0;i<index;i++)
		curr=curr.next;
	System.out.println(curr.data);
}
public void remove(int data)
{
	Node curr=head;
	while(curr.next.data!=data)
		curr=curr.next;
	curr.next=curr.next.next;
}
public void display()
{
	Node curr=head;
	while(curr!=null)
	{
		System.out.print(" "+curr.data+" ");
		curr=curr.next;
	}
}
public void reverse()
{
	Node curr=head;
	Node reversedPart=null;
	while(curr!=null)
	{
		Node temp=curr.next;
		curr.next=reversedPart;
		reversedPart=curr;
		curr=temp;
	}
	head=reversedPart;
}
}
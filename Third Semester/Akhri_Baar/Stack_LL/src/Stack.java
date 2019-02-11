public class Stack {
	Linked_List list=new Linked_List();
	public void push(int data)
	{
		list.add(data);
		list.display();
	}
	public void pop()
	{
		list.remove(list.tail.data);
		list.display();
	}
}

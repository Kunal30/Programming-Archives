public class Queue {
	Linked_List list=new Linked_List();
	public void enqueue(Object data)
	{   
		list.add(data);
	}
	public void dequeue()
	{
		list.remove(1);	
	}
	public void display()
	{ 
		 int pos=list.size();
		  for(int i=0;i<list.size();i++)
		  {  
			 System.out.println(list.get(pos));
			 pos--;
		  }
	}
}

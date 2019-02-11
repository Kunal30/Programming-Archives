public class Stack {
    Linked_List list=new Linked_List();
	public void push(Object data)
	{   
		list.add(data);
	}
   public void pop()
   {
	  list.remove(list.size());
   }
   public void display()
   {   int pos=list.size();
	  for(int i=0;i<list.size();i++)
	  {  
		 System.out.println(list.get(pos));
		 pos--;
	  }
   }
}

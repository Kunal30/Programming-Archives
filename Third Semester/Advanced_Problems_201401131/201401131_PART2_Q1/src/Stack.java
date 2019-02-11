public class Stack {
	Object arr[]=new Object[1000];
	int elements=0,i=0,j=0;
	int index=arr.length-1;
	public void push(Object data)
	{   if(elements>=arr.length)
	{
		System.out.println("Stack Overflow");
		return;
	}
		arr[index]=data;
	    index--;
	    elements++;
	}
   public Object pop()
   { 
	   Object obj=arr[index+1];
	   arr[index+1]=null;
	   index++;
	   elements--;
	   return obj;
   }
   public void display()
   {
	   for(int i=index;i<arr.length;i++)
        {  if(arr[i]==null)
        	;
        else
		   System.out.println(arr[i]);
        }
   }
   public void revdisplay()
   {
	   for(int i=arr.length-1;i>=index;i--)
       {  if(arr[i]==null)
       	;
       else
		   System.out.println(arr[i]);
       }   
   }
   public int size()
   {
	   return elements;
   }
   public boolean isEmpty()
   {
	   if(size()==0)
		   return true;
	   else 
		   return false;
   }
}

public class Queue {
	Object arr[]=new Object[1000];
	int index=arr.length-1,total=0,i=0,j=0;
	public void enqueue(Object data)
	{   
		arr[i]=data;
	    i++;
	    total++;
	}
	public Object dequeue()
	{  
		Object obj=arr[j];
		arr[j]=null;
		j++;		
		total--;
		return obj;
	}
	public int size()
	{
		return total;
	}
	public void display()
	{ 
		  for(int k=i;k>=j;k--)
	        {  if(arr[k]==null)
	        	;
	        else
			   System.out.println(arr[k]);
	        }
	}
}

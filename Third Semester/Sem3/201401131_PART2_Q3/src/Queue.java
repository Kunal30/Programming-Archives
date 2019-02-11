
public class Queue {
	Object arr[]=new Object[1000];
	int index=arr.length-1,total=0,i=0,j=0;
	public void enqueue(Object data)
	{   
		arr[i]=data;
	    i++;
	    total++;
	}
	public void dequeue()
	{
		arr[j]=null;
		j++;		
	}
	public void display()
	{ // System.out.println(index2);
		  for(int k=i;k>=j;k--)
	        {  if(arr[k]==null)
	        	;
	        else
			   System.out.println(arr[k]);
	        }
	}
}


public class Queue {
	 private static final int capacity =1000;  
	 Object arr[] = new Object[capacity];  
	 int size = 0;  
	 int top = -1;  
	 int rear = 0;
	 
	 public void enqueue(Object pushedElement) {  
	  if (top < capacity - 1) {  
	   top++;  
	   arr[top] = pushedElement;
	   size++;
	  } else {  
	   System.out.println("Overflow !");  
	  }  
	 }  

	 public Object dequeue() {
		 
		  if (top >= rear) {   
		   size--;
		   return arr[rear++];  
		    
		  } else {  
		   System.out.println("Underflow !"); 
		   return null;
		  }  
		 }  
	 public void reverse(Object x,Object y)
	 {   int total=size;
		 Object temp;
		 int tracker,tracker2;
		 Queue q2=new Queue();
		 Queue q3=new Queue();
		
		 {
			 temp=dequeue();			 
			 if(temp!=x||temp!=y)
			 {
				 q3.enqueue(dequeue());
			 }
			 else if(temp==x||temp==y)
			 {
				 q2.enqueue(dequeue());
				   temp=dequeue();
				 while(temp!=x||temp!=y)
				 {   
					 q2.enqueue(temp);
					 temp=dequeue();
				 }
				 q3.enqueue(temp);
				 enqueue(q2.dequeue());
				 while(q2.size!=0)
					 q3.enqueue(q2.dequeue());
				 temp=dequeue();
				 while(temp!=x||temp!=y)
				 {
					 q2.enqueue(dequeue());
					 temp=dequeue();
				 }
				 q3.enqueue(dequeue());
				 while(q2.size!=0)
					 q3.enqueue(q2.dequeue());
			 }
		 }
	 }
	
	 public void display() {  
		  if (top >= rear) {  
		   System.out.println("Elements in List : ");  
		   for (int i = rear; i <= top; i++) {  
		    System.out.println(arr[i]);  
		   }  
		  }  
		 }
}

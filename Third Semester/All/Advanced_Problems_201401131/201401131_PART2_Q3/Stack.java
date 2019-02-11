public class Stack {  
		 private static final int capacity =1000;  
		 Object arr[] = new Object[capacity];  
		 int size = 0;  
		 int top = -1;  
		 int rear = 0;
		 
		 public void push(Object pushedElement) {  
		  if (top < capacity - 1) {  
		   top++;  
		   arr[top] = pushedElement;
		   size++;
		   System.out.println("Element " + pushedElement  
		     + " is pushed to Stack !");  
		     
		  } else {  
		   System.out.println("Overflow !");  
		  }  
		 }
		 public Object pop() {
			   if(top==-1)
			   {
				   System.out.println("Underflow");
				   return null;
			   }
			   else
			   { 
				   
				   size--;
				   return arr[top--]; 
			
			   }
		 }
		 public void reverse(Object x,Object y)
		 {
			 Object temp;
			 int tracker;
			 Stack s2=new Stack();
			 Stack s3=new Stack();
			 while(1==1)
			 {
				 temp=pop();
				 if(temp==x||temp==y)
				 {s3.push(temp);
				  tracker=size;
				  break;
 				 }
				 else
			     s2.push(temp);
			 }
			 while(1==1)
			 {
				  temp=pop();
				 if(temp==x||temp==y)
				 {s2.push(temp);
				  break;
 				 }
				 else 
					 s2.push(temp);
		      }
			 push(s3.pop());
			 s3.push(s2.pop());
			 while(size!=tracker)
			 {
				 push(s2.pop());
			 }
			 push(s3.pop());
			 while(s2.size!=0)
			 {
				 push(s2.pop());
			 }
			 
		 }
		 
		 public void display() {  
		  if (top >= rear) {  
		   System.out.println("Elements in List : ");  
		   for (int i =top; i >= rear; i--) {  
		    System.out.println(arr[i]);  
		   }  
		  }
		 }
}

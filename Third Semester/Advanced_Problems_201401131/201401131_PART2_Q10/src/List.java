public class List {  
 private static final int capacity =1000;  
 int arr[] = new int[capacity];  
 int size = 0;  
 int top = -1;  
 int rear = 0;
 
 public void enqueue(int pushedElement) {  
  if (top < capacity - 1) {  
   top++;  
   arr[top] = pushedElement;
   size++;
   System.out.println("Element " + pushedElement  
     + " is Enqueued to List !");  
   display();  
  } else {  
   System.out.println("Overflow !");  
  }  
 }  
 public void PopOrDequeue()
 {
	 if(size<=8)
		 dequeue();
	 else
		 if(size>8)
			 pop();
 }
 public void dequeue() {
	 
  if (top >= rear) {  
   rear++; 
   size--;
   System.out.println("Dequeue operation done !");  
   display();  
  } else {  
   System.out.println("Underflow !");  
  }  
 }  
 public void pop() {
	   if(top==-1)
		   System.out.println("Underflow");
	   else
	   { 
		   System.out.println("Item popped="+arr[top--]);
		   size--;
		   display();
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
public class Stack {
	Object arr[]=new Object[1000];
	int elements,i=0,j=0;
	int index=arr.length-1,total;
	int top;
	public Stack() {
	      top = -1;
	   }
           public void push(Object j) {
        	   if(elements>=arr.length)
				{
					System.out.println("Stack Overflow");
					return;
				}
		      arr[++top] = j;
		      elements++;
		      total=elements;
             System.out.println(elements);
		   }
		   public Object pop() {
			   elements--;		
		      return arr[top--];
		   }
		   public Object peek() {
		      return arr[top];
		   }
		   public boolean isEmpty() {
		      return (top == -1);
		   }
		   public void display()
		   {
			   while (!isEmpty()) {
			         Object value = pop();
			         System.out.print(value);
			         System.out.print(" ");
			      }
		   }
}
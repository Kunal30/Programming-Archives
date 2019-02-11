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
			         System.out.println(value);
			       
			      }
		   }
		   public void solve(int n, Stack s1, Stack s2, Stack s3) {
		       if (n == 1) {
		           s3.push(s1.pop());
		       } else {
		           solve(n - 1, s1, s3, s2);
		           s3.push(s1.pop());
		           solve(n - 1, s2,s1,s3);
		       }
		       }
}
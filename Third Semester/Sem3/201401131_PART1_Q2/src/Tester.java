import java.io.*;
import java.util.Scanner;
public class Tester {
	public static void main(String args[])throws IOException
	{
		Stack s=new Stack();
		Queue q=new Queue();
	 	Scanner s1=new Scanner(System.in);
	    System.out.println("Enter the number of operations");
	    int n=Integer.parseInt(s1.next());
		 System.out.println("1)Push");
	  	 System.out.println("2)Pop");
	 	 for(int i=0;i<n;i++)
	 	 {
	 		 int inp=Integer.parseInt(s1.next());
	 		 if(inp==1)
	 		 {
	 			 int x=Integer.parseInt(s1.next());
	 			 s.push(x);
	 		 }
	 		 else if(inp==2)
	 		 {
	 			 s.pop();
	 		 }
	 	 }
	 	System.out.println("1)Enqueue");
	 	 System.out.println("2)Dequeue");
		 for(int i=0;i<n;i++)
		 {
			 int inp=Integer.parseInt(s1.next());
			 if(inp==1)
			 {
				 int x=Integer.parseInt(s1.next());
				 q.enqueue(x);
			 }
			 else if(inp==2)
			 {
				 q.dequeue();
			 }
		 }

	}
}

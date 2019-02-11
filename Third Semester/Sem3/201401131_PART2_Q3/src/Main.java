import java.io.*;
import java.util.Scanner;
public class Main {
	public static void main(String args[])throws IOException
	{
		Scanner s1=new Scanner(System.in);
		Stack S1=new Stack();
		Queue Q1=new Queue();
		S1.push(1);
		S1.push(2);
		S1.push(3);
		S1.push(4);
		S1.push(5);
		S1.push(6);
		S1.push(7);
		S1.display();
		System.out.println("Enter the indices=");
		Object i1=Integer.parseInt(s1.next());
		Object i2=Integer.parseInt(s1.next());
		S1.reverse(i1,i2);
		S1.display();
	}
}

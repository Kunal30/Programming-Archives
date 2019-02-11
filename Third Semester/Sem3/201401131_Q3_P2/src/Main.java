import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])throws IOException
{
	Scanner s=new Scanner(System.in);
	Stack s1=new Stack();
	s1.push(1);
	s1.push(2);
	s1.push(3);
	s1.push(4);
	s1.push(5);
	s1.push(6);
	s1.push(7);
/*	System.out.println("Enter 2 elements for reversing in a stack");
	int x=Integer.parseInt(s.next());
	int y=Integer.parseInt(s.next());
	s1.reverse(x,y);
	s1.display();*/
	System.out.println("Enter 2 elements for reversing continguously in a stack");
	int a=Integer.parseInt(s.next());
	int b=Integer.parseInt(s.next());
	s1.reverseContiguous(a,b);
	
	
/*	
	Queue q1=new Queue();
	q1.enqueue(1);
	q1.enqueue(2);
	q1.enqueue(3);
	q1.enqueue(4);
	q1.enqueue(5);
	q1.enqueue(6);
	q1.enqueue(7);	
	System.out.println("Enter 2 elements for reversing in a queue");
	int x=Integer.parseInt(s.next());
	int y=Integer.parseInt(s.next());
	q1.reverse(x,y);
	q1.display();*/	
}
}

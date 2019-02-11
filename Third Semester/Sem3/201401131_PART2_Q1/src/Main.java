import java.io.*;
import java.util.Scanner;
public class Main {

	public static void main(String args[])throws IOException
	{
	 	Queue_From_Stacks q=new Queue_From_Stacks();
	 	Stack_from_Queues s=new Stack_from_Queues();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
	    q.dequeue();
	    q.dequeue();
		q.enqueue(7);
		q.enqueue(9);
		q.dequeue();
		q.enqueue(4);
		q.enqueue(8);
		q.dequeue();
		q.enqueue(17);
		q.dequeue();
	 	s.push(4);
	 	s.push(8);
	 	s.push(98);
	 	s.pop();
	 	s.push(7);
	 	s.pop();
	 	s.push(5);
	 	s.push(1432);
	 	s.push(1341);
	 	s.push(34155);
	 	s.pop();
	 	s.pop();
	 	s.pop();
	 	s.pop();
	 	s.pop();
	 	s.pop();
	}
	
}

import java.io.*;
import java.util.Scanner;
public class Main {
	public static void main(String args[])throws IOException
	{
		Queue q=new Queue();
		q.enqueue(134);
		q.enqueue(345);
		q.enqueue(36);
		q.enqueue(3244);
		q.enqueue(3565);
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}
}

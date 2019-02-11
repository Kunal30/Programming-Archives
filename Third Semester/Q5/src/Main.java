import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])throws IOException
{
	Priority_Queue Q1=new Priority_Queue();
	Priority_Queue Q2=new Priority_Queue();
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the total jobs");
	int n=Integer.parseInt(s1.next());
	System.out.println("Enter the jobs and its priorities");
	for(int i=0;i<n;i++)
	{
		Q1.jobs[i]=(s1.next());
		Q1.Max_Heap_Insert(Integer.parseInt(s1.next()));
	}
	Q1.print();
}
}

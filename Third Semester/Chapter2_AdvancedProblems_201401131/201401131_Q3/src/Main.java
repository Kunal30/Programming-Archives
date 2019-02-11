import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])throws IOException
{
	int n[]={2,124,213,11,54,22,54657,13};
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter 1 for finding maximum and 2 for finding minimum");
	int choice=Integer.parseInt(s1.next());
	if(choice==1)
	{
		int max=n[0];
		for(int i=1;i<n.length;i++)
		{
			if(max<n[i])
				max=n[i];
		}
		System.out.println("Maximum Element="+max);
	}
	else if(choice==2)
	{
		int min=n[0];
		for(int i=1;i<n.length;i++)
		{
			if(min>n[i])
				min=n[i];
		}
		System.out.println("Minimum Element="+min);
	}
	else
		System.out.println("Wrong Choice");
}
}

import java.util.Scanner;
public class Main {
public static void main(String args[])
{
	Scanner s1=new Scanner(System.in);
	int T=Integer.parseInt(s1.next());
	for(int i=0;i<T;i++)
	{
		long p=Long.parseLong(s1.next());
		System.out.println((int)(Math.ceil(Math.log(p)/Math.log(3))));
	}
}
}

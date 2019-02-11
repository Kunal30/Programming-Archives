import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])throws IOException
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the k of the k-ary heap");
	int k=Integer.parseInt(s1.next());
	System.out.println("Enter the number of elements");
	int total=Integer.parseInt(s1.next());
	display_Parent_Child_Indices(k,total);
}
public static void display_Parent_Child_Indices(int k,int total)
{
	for(int i=0;i<total;i++)
	{
		System.out.println("Current Node's Index="+i);
		System.out.println("Children indices=");
		for(int j=1;j<=k;j++)
		{
			if(k*i+j<total)
				System.out.println(k*i+j);
		}
		if(i%k==0&&i!=0)
			System.out.println("Parent's Indices="+(i-1)/k);
		else if(i%k!=0)
			System.out.println("Parent's Indices="+(i)/k);
		System.out.println();
	}
}
}

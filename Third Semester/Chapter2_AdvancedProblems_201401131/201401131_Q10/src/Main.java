import java.util.Scanner;
import java.io.*;
public class Main {	
public static void main(String args[])throws IOException
{
 Scanner s1=new Scanner(System.in);
 int  A[]={1,2,3,4,5};
 int n=A.length;
 int inversions=findInversions(A);
 System.out.println("Original Inversions="+inversions);
 System.out.println("Enter the number of inversions till which you want to alter the array");
 int k=Integer.parseInt(s1.next());
 if(k>(n*(n-1))/2)
	 System.out.println("Impossible!!!!!!");
 else
 {
	 if(k<=inversions)
		 LimitedBubSort(A,k);
	 else
		 if(k>inversions)
			 LimitedRevBubSort(A,k);
	 
 }
 System.out.println("Updated Array->");
 for(int i=0;i<n;i++)
	 System.out.print(A[i]+" ");
 System.out.println();
 System.out.println("New Inversions="+findInversions(A));
}
public static void  LimitedBubSort(int []A,int k)
{
	for(int i=0;i<A.length;i++)
	{
		if(findInversions(A)==k)
			break;
		for(int j=0;j<A.length-1;j++)
		{
			if(findInversions(A)==k)
				break;
			if(A[j]>A[j+1])
			{
				int temp=A[j];
				A[j]=A[j+1];
				A[j+1]=temp;
			}
		}
	}
}
public static void  LimitedRevBubSort(int []A,int k)
{
	for(int i=0;i<A.length;i++)
	{
		if(findInversions(A)==k)
			break;
		for(int j=0;j<A.length-1;j++)
		{
			if(findInversions(A)==k)
				break;
			if(A[j]<A[j+1])
			{
				int temp=A[j];
				A[j]=A[j+1];
				A[j+1]=temp;
			}
		}
	}
}
public static int findInversions(int []A)
{
	int counter=0;
	for(int i=0;i<A.length;i++)
	{
		for(int j=i+1;j<A.length;j++)
		{
			if(A[i]>A[j])
				counter++;
		}
	}
	return counter;
}
}

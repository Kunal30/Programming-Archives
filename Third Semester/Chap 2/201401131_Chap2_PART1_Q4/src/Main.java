import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])throws IOException
{
	Scanner s1=new Scanner(System.in);
	int n[]={123,43,11,34,55,23,12};
	System.out.println("Enter the rank of the corresponding element you want to find");
	int rank=Integer.parseInt(s1.next());
    int answer=Randomized_Select(n,0,n.length-1,rank);
    if(rank>n.length)
    	System.out.println("Rank Out Of bound");
    else
    System.out.println("Number is "+answer);
}
public static int Randomized_Select(int []n,int p,int r,int rank)
{
	if(p==r)
		return n[p];
	int q=partition(n,p,r);
	int k=q-p+1;
	if(rank==k)
		return n[q];
	else if(rank<k)
		 return Randomized_Select(n,p,q-1,rank);
	else
		return Randomized_Select(n,q+1,r,rank-k);	
}
public  static int partition(int []n,int lower,int higher)
{
	int x=n[higher];
	int i=lower-1;
	for(int j=lower;j<=higher-1;j++)
	{
		if(n[j]<=x)
		{
			i++;
			swap(n,i,j);
		}
	}
	swap(n,i+1,higher);
	return i+1;
}
public static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
}

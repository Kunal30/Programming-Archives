import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])throws IOException
{
	int n[]={1,12,23,45,56,66};
	int search,lb=0,ub=n.length-1;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the element to be searched");
	search=Integer.parseInt(s1.next());
	BinarySearchIterative(n,search);
	BinarySearchRecursive(n,search,lb,ub);
}
public static void BinarySearchIterative(int []n,int search)
{
	int lb=0,ub=n.length-1,mid=0;
	int flag=1;
	while(lb<=ub && flag==1)
	{
		mid=(lb+ub)/2;
		if(n[mid]==search)
		{
			flag=0;
			break;
		}
		else if(search>n[mid])
		lb=mid+1;
		else
		if(search<n[mid])
			ub=mid-1;
	}
	if(flag==0)
	System.out.println("Found at "+(mid+1)+" Element "+n[mid]+" through Iterative Process");
	else 
		System.out.println("Not found in the list through Iterative process");
}
public static void BinarySearchRecursive(int []n,int search,int lb,int ub)
{ 
  if(lb<=ub)
  {	   
  int mid=(lb+ub)/2;
  if(n[mid]==search)
  {     
		System.out.println("Found at "+(mid+1)+" Element "+n[mid]+" through recursive process");
		return;
  }
  else
  if(search>n[mid])
	  BinarySearchRecursive(n,search,mid+1,ub);
  else
  if(search<n[mid])
	  BinarySearchRecursive(n,search,lb,mid-1);
  
  }
  else
  {
	  System.out.println("Element not found through Recursive Process!!");
	  return;
  }
}
}
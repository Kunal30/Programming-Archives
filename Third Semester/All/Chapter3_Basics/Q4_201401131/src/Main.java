import java.io.*;
import java.util.Scanner;
public class Main {
static int heapsize,N;
public static void main(String args[])throws IOException
{
	int maxcapacity=100;
	int A[]=new int[maxcapacity];
  Scanner s1=new Scanner(System.in);
  System.out.println("Enter the number of elements you want to insert");
   heapsize=Integer.parseInt(s1.next());
  System.out.println("Enter the elements");
  for(int i=0;i<heapsize;i++)
	 A[i]=Integer.parseInt(s1.next());
  System.out.println("1)Insert a Number");
  System.out.println("2)Delete/Extract a Number");
  System.out.println("3)Key value increase");
  System.out.println("4)Key value decrease");
  int inp=Integer.parseInt(s1.next());
  if(inp==1)
  {
  System.out.println("Enter the number to be added");
  int no=Integer.parseInt(s1.next());
    Max_Heap_Insert(A,no);
	  for(int j=0;j<heapsize;j++)
	  {
		  System.out.print(" "+A[j]+" ");
	  }
  }
  if(inp==2)
  {
	  heapify(A);
	  System.out.println("Enter the key value to be deleted");
	  int no=Integer.parseInt(s1.next());
	  Max_Heap_Delete(A,no);
  }
  if(inp==3)
  {
	  System.out.println("Enter the position and the key");
	  int pos=Integer.parseInt(s1.next());
	  int key=Integer.parseInt(s1.next());
	  Heap_Increase_Key(A,pos,key);
	  System.out.println("New heap=");
	  for(int j=0;j<heapsize;j++)
	  {
		  System.out.print(" "+A[j]+" ");
	  }
  }
  if(inp==4)
  {
	  System.out.println("Enter the position and the key");
	  int pos=Integer.parseInt(s1.next());
	  int key=Integer.parseInt(s1.next());
	  Heap_Decrease_Key(A,pos,key);
	  System.out.println("New heap=");
	  for(int j=0;j<heapsize;j++)
	  {
		  System.out.print(" "+A[j]+" ");
	  }
  }
}
public static void heapify(int arr[])
{
    for (int i = (heapsize)/2; i >= 0; i--)
        maxheap(arr, i);        
}        
public static void maxheap(int arr[], int i)
{ 
    int left = 2*i ;
    int right = 2*i + 1;
    int max = i;
    if (left <= heapsize && arr[left] > arr[i])
        max = left;
    if (right <= heapsize && arr[right] > arr[max])        
        max = right;

    if (max != i)
    {
        swap(arr, i, max);
        maxheap(arr, max);
    }
}
public static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
public static void Heap_Decrease_Key(int []A,int i,int key)
{
	if(key>A[i])
		System.err.println("New key is greater than current key");
	A[i]=key;
	heapify(A);
}
public static void Heap_Increase_Key(int []A,int i,int key)
{
	if(key<A[i])
		System.err.println("New key is smaller than current key");
	A[i]=key;
	heapify(A);
}
public static void Max_Heap_Insert(int []A,int key)
{
	heapsize=heapsize+1;
	A[heapsize-1]=-999999999;
	Heap_Increase_Key(A,heapsize-1,key);
}
public static void Max_Heap_Delete(int []A,int key)
{
	int i=0,number=0;
	if(heapsize<1)
		System.err.println("Heap Underflow!!");
	while(key!=A[i])
	i++;
	number=A[i];
	A[i]=A[heapsize-1];
	heapsize--;
	maxheap(A,0);
	System.out.println("Item "+number+" has been deleted!");
	System.out.println("New heap=");
	for(int j=0;j<heapsize;j++)
	  {
		  System.out.print(" "+A[j]+" ");
	  }
}
}
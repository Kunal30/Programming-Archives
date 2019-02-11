import java.io.*;
import java.util.Scanner;   
public class Main {
	static int n[]={12,425,2344,1134,3456,343,135,566,14};
	static int tempMergArr[]=new int[n.length];
    static int N;
public static void main(String args[])throws IOException
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Which sort do you want to perform");
	System.out.println("1 Bubble");
	System.out.println("2 Selection");
	System.out.println("3 Insertion");
	System.out.println("4 Merge");
	System.out.println("5 Quick");
	System.out.println("6 Heap");
	int choice=Integer.parseInt(s1.next());
	switch(choice)
	{  case 1:BubbleSort(n);
	          break;
	
	case 2:	SelectionSort(n);
	        break;
	case 3:	InsertionSort(n);
	        break;
	case 4:Merge_Sort(n,0,n.length-1);
	        System.out.println("Array After Merge Sorting=");
			for(int i=0;i<n.length;i++)
				System.out.print(n[i]+" ");
		        break;
	case 5:QuickSort(n,0,n.length-1);
	       System.out.println("Array After Quick Sorting=");
		for(int i=0;i<n.length;i++)
			System.out.print(n[i]+" ");
	        break;
	case 6:HeapSort(n);
	       System.out.println("Array After Heap Sorting=");
		  	for(int i=0;i<n.length;i++)
			System.out.print(n[i]+" ");
		        break;
   default: System.out.println("Wrong Choice");
             break;
	}
}
public static void BubbleSort(int []n)
{
	for(int i=0;i<n.length;i++)
	{
		for(int j=0;j<n.length-1;j++)
		{
			if(n[j]>n[j+1])
			{
				int temp=n[j];
				n[j]=n[j+1];
				n[j+1]=temp;
			}
		}
	}
	System.out.println("Array After Bubble Sorting=");
	for(int i=0;i<n.length;i++)
		System.out.print(n[i]+" ");
	System.out.println();
}
public static void SelectionSort(int []n)
{
	 for (int i = 0; i < n.length - 1; i++) {
         int minPos = i;
         for (int j = i + 1; j < n.length; j++) {
             if (n[j] < n[minPos]) {
                 minPos = j;
             }
         }
         swap(n, minPos, i);
     }
	 System.out.println("Array After Selection Sorting=");
		for(int i=0;i<n.length;i++)
			System.out.print(n[i]+" ");
	
}
public static void InsertionSort(int []n)
{
	int i;
 for(int j=1;j<n.length;j++)
 {
	 int key=n[j];
	 i=j-1;
	 while((i>-1)&& n[i]>key)
	 {
		 n[i+1]=n[i];
		 i--;
	 }
	 n[i+1]=key;
 }
 System.out.println("Array After Insertion Sorting=");
	for(int z=0;z<n.length;z++)
		System.out.print(n[z]+" ");
}
public static void Merge_Sort(int []a,int p,int r)
{
	int q;
	if(p<r)
	{
		q=(p+r)/2;
		Merge_Sort(a,p,q);
		Merge_Sort(a,q+1,r);
		Merge(a,p,q,r);
	}
}
public static void Merge(int []a,int p,int q,int r)
{   
	for (int i = p; i <= r; i++) {
        tempMergArr[i] = a[i];
    }
    int i = p;
    int j = q + 1;
    int k = p;
    while (i <= q && j <= r) {
        if (tempMergArr[i] <= tempMergArr[j]) {
            a[k] = tempMergArr[i];
            i++;
        } else {
            a[k] = tempMergArr[j];
            j++;
        }
        k++;
    }
    while (i <= q) {
        a[k] = tempMergArr[i];
        k++;
        i++;
    }
}
public static void QuickSort(int []n,int lower,int higher)
{
	if(lower<higher)
	{
		int pivot=partition(n,lower,higher);
		QuickSort(n,lower,pivot-1);
		QuickSort(n,pivot+1,higher);
	}
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
public static void HeapSort(int arr[])
{       
    heapify(arr);        
    for (int i = N; i > 0; i--)
    {
        swap(arr,0, i);
        N = N-1;
        maxheap(arr, 0);
    }
}        
public static void heapify(int arr[])
{
    N = arr.length-1;
    for (int i = N/2; i >= 0; i--)
        maxheap(arr, i);        
}        
public static void maxheap(int arr[], int i)
{ 
    int left = 2*i ;
    int right = 2*i + 1;
    int max = i;
    if (left <= N && arr[left] > arr[i])
        max = left;
    if (right <= N && arr[right] > arr[max])        
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
}
public class Main {
	static int heapsize,N;
public static void main(String args[])
{  
	int A[]={1,2,3,4,5};
	heapsize=A.length;
	build_heapifymin(A);
	int n1=A.length;
	get_swapable_pair_of_nodes(A);
}
public static void get_swapable_pair_of_nodes(int []A)
{
	for(int i=0;i<A.length;i++)
	{
		for(int j=i+1;j<A.length;j++)
		{
			swap(A,j,i);
			if(MinHeapChecker(A)==true)
				System.out.println(A[i]+" and "+A[j]+" can be swapped");
			swap(A,j,i);		
		}
	}
 }
public static void build_heapifymin(int arr[])
{
    N = heapsize-1;
    for (int i = N/2; i >= 0; i--)
        minheap(arr, i);        
}
public static void minheap(int arr[], int i)
{ 
    int left = 2*i ;
    int right = 2*i + 1;
    int min = i;
    if (left <= N && arr[left] < arr[i])
        min = left;
    if (right <= N && arr[right] < arr[min])        
        min = right;

    if (min != i)
    {
        swap(arr, i, min);
        minheap(arr, min);
    }
}
public static void swap(int[] a, int i, int j) {
	if(i<a.length && j<a.length)
	{
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
	}
	}
public static boolean MinHeapChecker(int []a)
{ 
	int count=0;
	for(int i=0;i<a.length;i++)
	{
	   if(2*i+1<a.length && a[i]<a[2*i+1])
    	   count++;
       if(2*i+2<a.length && a[i]<a[2*i+2])
    	   count++;
	}
	if(count==a.length-1)
		return true;
	else
		return false;
}
}
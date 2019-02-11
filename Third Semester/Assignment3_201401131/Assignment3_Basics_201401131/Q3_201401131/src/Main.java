public class Main
{ 
	static int N;
	public static void main(String args[])
	{
		int A[]={12,345,11,10,3,2,341,35,13,124,121};
		HeapSort(A);
		for(int i=0;i<A.length;i++)
			System.out.println(A[i]);
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
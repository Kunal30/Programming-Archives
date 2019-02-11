public class Main {
    static int N;
	public static void main(String args[])
	{
		int arr[]={122,1231,4532,111,232,1255,22,1331,2333,5999,101};
	System.out.println(find2ndlargest(arr));
	System.out.println(find2ndsmallest(arr));
	}
	public static void heapifymax(int arr[])
	{
	    N = arr.length-1;
	    for (int i = N/2; i >= 0; i--)
	        maxheap(arr, i);        
	}
	public static void heapifymin(int arr[])
	{
	    N = arr.length-1;
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
    public static int find2ndlargest(int []arr)
    {
    	heapifymax(arr);
      int i=0;
      int left=2*i+1;
      int right=2*i+2;
      if(arr[left]>arr[right])
    	  return arr[left];
      else
          return arr[right];
    }
    public static int find2ndsmallest(int []arr)
    { 
    	heapifymin(arr);
        int i=0;
        int left=2*i+1;
        int right=2*i+2;
        if(arr[left]<arr[right])
      	  return arr[left];
        else
            return arr[right];
      }	
    	
    }
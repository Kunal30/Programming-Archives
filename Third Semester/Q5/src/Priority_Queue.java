public class Priority_Queue {
	int heapsize=0;
	int N;
	int maxcapacity=100;
	int A[]=new int[maxcapacity];
	String jobs[]=new String[maxcapacity];
	public  void heapify(int arr[])
	{
	    for (int i = (heapsize)/2; i >= 0; i--)
	        maxheap( i);        
	}        
	public  void maxheap( int i)
	{ 
	    int left = 2*i ;
	    int right = 2*i + 1;
	    int max = i;
	    if (left <= heapsize && A[left] > A[i])
	        max = left;
	    if (right <= heapsize && A[right] > A[max])        
	        max = right;

	    if (max != i)
	    {
	        swap(A, i, max);
	        swap(jobs,i,max);
	        maxheap(max);
	    }
	}
	public  void swap(int[] a, int i, int j) {
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
	public  void swap(String[] a, int i, int j) {
	    String temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
	public  void heapifymin(int arr[])
	{
	     N = heapsize-1;
	    for (int i = N/2; i >= 0; i--)
	        minheap( i);        
	}
	public  void minheap( int i)
	{ 
	    int left = 2*i ;
	    int right = 2*i + 1;
	    int min = i;
	    if (left <= N && A[left] < A[i])
	        min = left;
	    if (right <= N && A[right] < A[min])        
	        min = right;

	    if (min != i)
	    {
	        swap(A, i, min);
	        swap(jobs,i,min);
	        minheap( min);
	    }
	}
	public  void Heap_Decrease_Key(int i,int key)
	{
		if(key>A[i])
			System.err.println("New key is greater than current key");
		A[i]=key;
		heapifymin(A);
	}
	public  void Heap_Increase_Key(int i,int key)
	{
		if(key<A[i])
			System.err.println("New key is smaller than current key");
		A[i]=key;
		heapify(A);
	}
	public  void Max_Heap_Insert(int key)
	{
		 heapsize=heapsize+1;
		A[heapsize-1]=-999999999;
		Heap_Increase_Key(heapsize-1,key);
	}
	public int Max_Heap_Extract_Max()
	{
		if(heapsize<1)
			System.err.println("Heap Underflow!!");
	    int max=A[0];
		A[0]=A[heapsize-1];
		heapsize--;
		maxheap(0);
		return max;
	}
	public void print()
	{
		for(int i=0;i<heapsize;i++)
			System.out.println(jobs[i]+" "+A[i]);
	}
}

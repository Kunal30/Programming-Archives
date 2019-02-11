public class Main {
	static int n[]={1,3,5,2,4};
	static int comparisons=0;
	static int exchanges=0;
	public static void main(String args[])
	{
		QuickSort(n,0,n.length-1);
	       System.out.println("Array After Quick Sorting=");
		for(int i=0;i<n.length;i++)
			System.out.print(n[i]+" ");
		System.out.println();
		System.out.println("Number of comparisons="+comparisons);
		System.out.println("Number of exchanges="+exchanges);
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
			comparisons++;
			i++;
			swap(n,i,j);
		}
	}
	swap(n,i+1,higher);
	return i+1;
}
public static void swap(int[] a, int i, int j) {
	exchanges++;
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
}
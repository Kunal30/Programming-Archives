public class Quick_Sort {
	
public static void main(String args[])
{
	int arr[]={134,245,13414,45,232,11,35,1,256};
	QuickSort(arr,0,arr.length-1);
	for(int i=0;i<arr.length;i++)
		System.out.print(" "+arr[i]+" ");
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
public static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
}

public class SS {
public static void main(String args[])
{
	int arr[]={134,245,13414,45,232,11,35,1,256};

	for(int i=0;i<arr.length-1;i++)
	{
		int minPos=i;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]<arr[minPos])
			{
				minPos=j;
			}
		}
		swap(arr,i,minPos);
	}
	for(int i=0;i<arr.length;i++)
		System.out.print(" "+arr[i]+" ");
}
public static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
}

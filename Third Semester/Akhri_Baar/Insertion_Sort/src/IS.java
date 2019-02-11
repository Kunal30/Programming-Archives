public class IS {
public static void main(String args[])
{
	int arr[]={134,245,13414,45,232,11,35,1,256};
	for(int j=1;j<arr.length;j++)
	{
		int key=arr[j];
		int i=j-1;
		while((i>-1) && arr[i]>key)
		{
			arr[i+1]=arr[i];
			i--;
		}
		arr[i+1]=key;
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

public class Main {
public static void main(String args[])
{
	int arr[]={134,245,13414,45,232,11,35,1,256};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++)
		System.out.print(" "+arr[i]+" ");
}
}
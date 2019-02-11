public class BS {
 static int arr[]={1,2,34,47,89,90,99,104,111};
public static void main(String args[])
{
	int lb=0,ub=arr.length-1;
	BSearch(89,lb,ub);
}
public static void BSearch(int data,int lb,int ub)
{
	if(lb<=ub)
	{
		int mid=(lb+ub)/2;
		if(data==arr[mid])
			{
			System.out.println("found at "+(mid+1));
			return;
			}
		else if(data<arr[mid])
			BSearch(data,lb,mid);
		else if(data>arr[mid])
			BSearch(data,mid,ub);
	}
}
}


public class Main {
public static void main(String args[])
{
	int n[]={123,43,11,34,55,23,12};
	int q=partition(n,0,6);
	System.out.println(q);
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
	for(int z=0;z<n.length;z++)
		System.out.print(n[z]+" ");
	System.out.println();
	return i+1;
}
public static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

}

public class Main {
public static void main(String args[])
{
	int A[]={111,222,333,456,233,132,122};
	Radix_Sort(A);
	for(int i=0;i<A.length;i++)
		System.out.print( A[i]+" ");
}
public static void Radix_Sort(int []A)
{
	int max=A[0],exp=1,n=A.length;
	int B[]=new int[n];
	for(int i=1;i<n;i++)
	{
		if(max<A[i])
			max=A[i];
	}
	while(max/exp>0)
	{
		int bucket[]=new int[10];
		for(int i=0;i<n;i++)
		bucket[(A[i]/exp)%10]++;
		for(int i=1;i<n;i++)
			bucket[i]+=bucket[i-1];
		for(int i=n-1;i>=0;i--)
			B[--bucket[(A[i]/exp)%10]]=A[i];
		for(int i=0;i<n;i++)
			A[i]=B[i];
		exp*=10;
		}
}
}
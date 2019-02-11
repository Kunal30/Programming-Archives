public class Main {
public static void main(String args[])
{
	int A[]={121,212,133,556,633,112,152};
	Radix_Sort_according_to_digits(A);
	for(int i=0;i<A.length;i++)
		System.out.print( A[i]+" ");
}
public static void Radix_Sort_according_to_digits(int []A)
{
	int max=A[0],exp=1,n=A.length;
	int B[]=new int[n];
	int digit=1;
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
		while((((A[0])/exp)%10)<digit)
		{
			shift(A);
		}
		exp*=10;
		digit++;
	}
}
public static void shift(int []A)
{
	int temp=A[0];
	for(int i=0;i<A.length-1;i++)
		A[i]=A[i+1];
	A[A.length-1]=temp;
}
}
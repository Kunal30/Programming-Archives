public class Main {
public static void main(String args[])
{
	int A[]={9,8,7,6,5,4,2,3,1};
	int max=A[0];
	int min=A[0];
	for(int i=1;i<A.length;i++)
	{
		if(max<A[i])
			max=A[i];
		if(min>A[i])
			min=A[i];
	}
	 countingSort(A,min,max);
}
public static void countingSort(int[] array, int min, int max)
{
	int[] count= new int[max - min + 1];
	for(int number : array)
	{
		count[number - min]++; 
	}
	int z=0;
	for(int i= min;i <= max;i++)
	{
		while(count[i - min] > 0)
		{
			array[z]= i;
			z++;
			count[i - min]--;
		}
	}
	for(int i=0;i<array.length;i++)
	System.out.print(array[i]+" ");
}
}
public class Main {
public static void main(String args[])
{
	int A[]={1,1,1,2,2,3,3,3,3,4,4,4};
	int max=A[0];
	int min=A[0];
	for(int i=1;i<A.length;i++)
	{
		if(max<A[i])
			max=A[i];
		if(min>A[i])
			min=A[i];
	}
	 countingSortaccordingtofrequency(A,min,max);
}
public static void countingSortaccordingtofrequency(int[] array, int min, int max)
{
	int[] count= new int[max - min + 1];
	for(int number : array)
	{
		count[number - min]++; 
	}
	int fmin=count[0];
    for(int i=1;i<count.length;i++)
    {
    	if(fmin>count[i])
    		fmin=count[i];
    }
	int z=0,j=0;
    while(z<array.length&&fmin>0)
    { 
	for(int i= min;i <= max;i++)
	{  		
		while(j<fmin&&count[i-min]>0&&z<array.length)
		{
			array[z]= i;
			z++;
			j++;
		}
		j=0;
	}
	for(int i=0;i<count.length;i++)
		count[i]=count[i]-fmin;
    for(int i=1;i<count.length;i++)
    {
    	if(fmin>count[i] && count[i]>=1)
    		fmin=count[i];
    }
    }
	for(int i=0;i<array.length;i++)
	System.out.print(array[i]+" ");
}
}
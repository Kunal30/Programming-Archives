public class Main {
public static void main(String args[])
{
	int A[]={1,5,3,4};
	System.out.println("Possible Arrangements=");
	permute(A,0);
}
public static void permute(int[] a, int k) 
{
    if (k == a.length) 
    {
    	if(MaxHeapChecker(a)==true)
    	{
         for (int i = 0; i < a.length; i++) 
        {
            System.out.print(" [" + a[i] + "] ");
        }
        System.out.println();
    	}
    } 
    else 
    {
        for (int i = k; i < a.length; i++) 
        {
            int temp = a[k];
            a[k] = a[i];
            a[i] = temp;
            permute(a, k + 1);
            temp = a[k];
            a[k] = a[i];
            a[i] = temp;
        }
    }
}
public static boolean MaxHeapChecker(int []a)
{ 
	int count=0;
	for(int i=0;i<a.length;i++)
	{
	   if(2*i+1<a.length && a[i]>a[2*i+1])
    	   count++;
       if(2*i+2<a.length && a[i]>a[2*i+2])
    	   count++;
	}
	if(count==a.length-1)
		return true;
	else
		return false;
}
}
import java.io.*;
import java.util.Scanner;
public class Main {
	static int a[]={245,42,1345,66,3,257,2578,8966};
	static int tempMergArr[]=new int[a.length];
public static void main(String args[])throws IOException
{
	
	Merge_Sort(a,0,7);
	for(int i=0;i<8;i++)
		System.out.println(a[i]);
}
public static void Merge_Sort(int []a,int p,int r)
{ int q;
	if(p<r)
	{
		q=(p+r)/2;
		Merge_Sort(a,p,q);
		Merge_Sort(a,q+1,r);
		Merge(a,p,q,r);
	}
}
public static void Merge(int []a,int p,int q,int r)
{   
	for (int i = p; i <= r; i++) {
        tempMergArr[i] = a[i];
    }
    int i = p;
    int j = q + 1;
    int k = p;
    while (i <= q && j <= r) {
        if (tempMergArr[i] <= tempMergArr[j]) {
            a[k] = tempMergArr[i];
            i++;
        } else {
            a[k] = tempMergArr[j];
            j++;
        }
        k++;
    }
    while (i <= q) {
        a[k] = tempMergArr[i];
        k++;
        i++;
    }
}
}
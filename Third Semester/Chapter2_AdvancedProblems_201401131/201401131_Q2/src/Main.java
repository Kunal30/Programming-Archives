import java.io.*;
import java.util.Scanner;
public class Main {
	static int n;
public static void main(String args[])throws IOException
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the number of which you want to create the matrix");
    n=Integer.parseInt(s1.next());
	int array[]=new int[n*n];
	for(int i=0;i<n*n;i++)
	 array[i]=i+1;	
	System.out.println("Enter the rank of the element for which you want to find the location");
    int rank=Integer.parseInt(s1.next());
    if(rank>n*n)
    	System.out.println("Rank out of bound!!");
    else
	Create(array,rank,n);
}
public static void Create(int []array,int rank,int n)
{
   int locationarr[][]=new int[n][n];
   int Matrix[][]=new int[n][n];
   permute(array,0,Matrix,n,rank,locationarr);
}
public static void permute(int[] a, int k,int [][]Matrix,int n,int rank,int locationarr[][]) 
{
    if (k == a.length) 
    { 
    	int x=0,y=0;
        for (int i = 0; i < a.length; i++) 
        {
            Matrix[x][y]=a[i];
            y++;
            if(y==n)
            {
             x++;
             y=0;
            }
        }
        checkMatrixCondition(Matrix,rank,n,locationarr);
    } 
    else 
    {
        for (int i = k; i < a.length; i++) 
        {
            int temp = a[k];
            a[k] = a[i];
            a[i] = temp;
            permute(a, k + 1,Matrix,n,rank,locationarr);
            temp = a[k];
            a[k] = a[i];
            a[i] = temp;
        }
    }
}
public static void checkMatrixCondition(int [][]Matrix,int rank,int n,int locationarr[][])
{  
	int i=0,j=0;
	for(int x=0;x<n;x++)
	{
		for(int y=0;y<n;y++)
		{
			if(Matrix[x][y]==rank)
			{
				i=x;
				j=y;
				break;
			}
		}
	}
	int count=0; 
	for(int x=0;x<n;x++)
	{
		for(int y=0;y<n;y++)
		{   
			if(x<n-1&&y<n-1)
			{
			if(Matrix[x][y]<Matrix[x+1][y]&&Matrix[x][y]<Matrix[x][y+1])
			count++;
			}
			else
			if(x==n-1&&y<n-1)
			{
				if(Matrix[x][y]<Matrix[x][y+1])
					count++;
			}
			else if(y==n-1&&x<n-1)
			{
				if(Matrix[x][y]<Matrix[x+1][y])
					count++;
			}
			else if(x==n-1&&y==n-1)
				count++;
		}
	}
	if(count==n*n&&(locationarr[i][j]==0))
		{
		System.out.println("I="+i+" J="+j);
		locationarr[i][j]++;
		}
}
}
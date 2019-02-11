import java.io.*;
import java.util.Scanner;
public class Main {
	static int x;
	static int y;
public static void main(String args)throws IOException
{   
	int max=0;
	int a=0,b=0;
	Scanner s1=new Scanner(System.in);
    int T=Integer.parseInt(s1.next());
    for(int i=0;i<T;i++)
    {
    	int N=Integer.parseInt(s1.next());
    	int arr[]=new int[N];
    	for(int j=0;j<N;j++)
    		arr[j]=Integer.parseInt(s1.next());
    	for(int k=0;k<N;k++)
    		{
    		  int ans=F(arr,k);
    		  if(max<ans)
    			  {
    			  max=ans;
    			  a=x;
    			  b=y;
    			  }
    		}
    	System.out.println(a+"/"+b);
    }
	
}
public static int F(int []arr,int z)
{
   x=0;
   y=0;
   for(int i=0;i<z;i++)
   {
	   if(arr[i]==1)
		   x++;
	   if(arr[i]==-1)
		   y++;
   }
   if(y==0)
	   return 0;
   else
	   return x/y;
}
}

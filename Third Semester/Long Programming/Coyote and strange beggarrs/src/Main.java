import java.util.Scanner;
public class Main {
public static void main(String args[])
{
	Scanner s1=new Scanner(System.in);
	int N=Integer.parseInt(s1.next());
	long itemsneeded=0,a=0;
	long p,q;
	 long instock[]=new long[1000];
	for(int i=0;i<N;i++)
	{
		int flag=0;
	 p=Long.parseLong(s1.next());
	 {
		 instock[(int) a]=p;
		 a++;
	 }
	 q=Integer.parseInt(s1.next());
	 for(int j=0;j<=a;j++)
	 {
	   if(q==instock[j])
	   {
		   flag=1;
		   break;
	   }
	 }
	 if(flag==0)
	 { itemsneeded++;
	   instock[(int) a]=q;
	   a++;
	 }
	}
   System.out.println(itemsneeded);
}
}

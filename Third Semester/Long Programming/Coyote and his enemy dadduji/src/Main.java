//HINT= Solve without recursion
import java.util.Scanner;
public class Main {
public static void main(String args[])
{
	Scanner s1=new Scanner(System.in);
	int t=Integer.parseInt(s1.next());
	for(int i=0;i<t;i++)
	{
 	    Long n=Long.parseLong(s1.next());
    	Long m=Long.parseLong(s1.next());
	    Long a=Long.parseLong(s1.next());
	    Long b=Long.parseLong(s1.next());
	    Long c=Long.parseLong(s1.next());
	    Long A=a*m;
	    Long B=A*(b+c);
	    Long C=(A+B+(A*(long)((Math.ceil(Math.log(a*b*c)/Math.log(10))))));
	    System.out.println(f(n,A,B,C)%3);
	}
}
public static long f(Long n,Long A,Long B,Long C)
{   
 	if(n==2)
	{
		return (long)(4+16*A+2*B+16*C);
	}
	
	return (long)((Math.pow(n,n)+A*Math.pow(n,4)+B*fact(n)+C*(Math.pow(Math.pow(n,n),n)))*f(n-1,A,B,C));
}
public static Long fact(Long n)
{
	Long f=(long) 1;
	for(int i=1;i<=n;i++)
		f*=i;
	return f;
}
}

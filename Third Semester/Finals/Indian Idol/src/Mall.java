import java.io.*;
import java.util.*;
public class Mall {
	static int t_total=0;
	static int total_swaps=0;
	static int p_time;
	static int t_wait;
	static int t_service;
public static void main(String args[])throws IOException
{   
	Queue_Linked_List []L=new Queue_Linked_List[4];
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter no. of participants");
	int total=Integer.parseInt(s1.next());
	System.out.println("Enter time taken for performance");
	p_time=Integer.parseInt(s1.next());
	System.out.println("Enter waiting time");
	t_wait=Integer.parseInt(s1.next());
	System.out.println("Enter public srvice time");
	t_service=Integer.parseInt(s1.next());
	Participant p[]=new Participant[total];
	Random rndm=new Random();
	for(int i=0;i<total;i++)
	{   
		int index=rndm.nextInt(4);
		p[i]=new Participant(i+1);
		t_total=t_total+30;
		L[index].add(p[i]);
		if(p[i].twait==300)
			p[i].swap();
		if(i==0)
			p[i].perform();
		
	}
}
}

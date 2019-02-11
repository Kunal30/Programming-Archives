import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])throws IOException
{
	Scanner s1=new Scanner(System.in);
	int n[]={23,45,12,43,66,54,21};
	System.out.println("Enter the element whose rank you want to find");
	int element=Integer.parseInt(s1.next());
	int rank=0;
	int i=0;
	while(i!=n.length)
	{
		if(element>n[i])
			rank++;
		i++;
	}
	System.out.println("Rank of the given element="+(++rank));
}
}

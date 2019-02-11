import java.io.*;
import java.util.Scanner;
public class Tester {
public static void main(String args[])throws IOException
{
	Linked_List list=new Linked_List();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	System.out.println("Enter the number of  reversals you want to perform");
	Scanner s1=new Scanner(System.in);
	int rev=Integer.parseInt(s1.next());
	int index[]=new int[rev];
	System.out.println("Enter the indices within which you want to reverse the elements.Please write in ascending order");
	for(int i=0;i<rev;i++)
	index[i]=Integer.parseInt(s1.next());
    list.reverseList(index);	
    list.printList();
}
}

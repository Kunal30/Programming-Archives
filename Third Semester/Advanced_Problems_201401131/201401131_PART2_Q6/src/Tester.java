import java.io.*;
import java.util.Scanner;
public class Tester {
public static void main(String args[])throws IOException
{
	Linked_List list=new Linked_List();
	list.add(5);
	list.add(4);
	list.add(3);
	list.add(2);
	list.add(1);
	list.add(0);
	System.out.println("Enter the indices within which you want to reverse the elements");
	Scanner s1=new Scanner(System.in);
	int x=Integer.parseInt(s1.next());
	int y=Integer.parseInt(s1.next());
    list.reverseList(x,y);	
    list.printList();
    System.out.println();
}
}

import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])throws IOException
{
	Scanner s1=new Scanner(System.in);
	Linked_List l1=new Linked_List();
	l1.add(2);
	l1.add(2);
	l1.add(2);
	l1.add(2);
	l1.add(2);
	l1.add(2);
	l1.add(2);
    System.out.println("Enter the keyfield to be returned");
    Object n=Integer.parseInt(s1.next());
    Linked_List l2=new Linked_List();
    l2=l1.scanList(n);
}
}

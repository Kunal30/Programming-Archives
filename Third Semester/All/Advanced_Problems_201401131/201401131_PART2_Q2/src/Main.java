import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])throws IOException
{
	Linked_List list=new Linked_List();
	list.add(5);
	list.add(9);
	list.add(2);
	list.add(3);
	list.add(6);
	list.add(9);
	list.add(7);
	list.add(8);
	list.printList();
	list.reverseList();
	list.printList();
}
}

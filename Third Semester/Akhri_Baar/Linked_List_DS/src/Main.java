import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])throws IOException
{
	Linked_List list=new Linked_List();
	list.add(34);
	list.add(123);
	list.add(334);
	list.add(1223);
	list.add(12312);
	list.add(4343);
	list.add(12352);
	list.display();
	list.reverse();
	System.out.println();
	list.display();
}
}

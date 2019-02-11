import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])throws IOException
{
	BST bst=new BST();
	bst.insert(new Node(50));
	bst.insert(new Node(40));
	bst.insert(new Node(60));
	bst.insert(new Node(35));
	bst.insert(new Node(45));
	bst.insert(new Node(30));
	System.out.println(bst.Successor(45).key);
}
}

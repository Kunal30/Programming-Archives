import java.io.*;
import java.util.*;
public class Input_Generator {
public static void main(String args[])
{
	Binary_Search_Tree bst=new Binary_Search_Tree();
	bst.add('A');
	bst.add('B');
	bst.add('C');
	bst.add('D');
	bst.add('E');
	bst.add('F');
/*	bst.add('G');
	bst.add('H');
		bst.add('I');
	bst.add('J');
	bst.add('K');
	bst.add('L');
	bst.print();*/
	System.out.println(bst.root.left.right.data);
}
}

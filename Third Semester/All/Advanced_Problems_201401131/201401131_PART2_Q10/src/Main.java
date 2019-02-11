import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])throws IOException
{
	List L=new List();
	L.enqueue(1);
	L.enqueue(5);
	L.enqueue(6);
	L.enqueue(9);
	L.enqueue(10);
	L.enqueue(111);
	L.enqueue(15);
	L.enqueue(113);
	L.enqueue(112);
	L.PopOrDequeue();
	L.PopOrDequeue();
	L.PopOrDequeue();
}
}

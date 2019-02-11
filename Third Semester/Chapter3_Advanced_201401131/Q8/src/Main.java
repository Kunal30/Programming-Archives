import java.util.Scanner;
import java.io.*;
public class Main {
public static void main(String args[])throws IOException
{
	int heap_height=1;
	double inversions=0,height_elements;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter number of elements");
	int n=Integer.parseInt(s1.next());
	System.out.println("Minimum Inversions="+0);
	//The arrangement comprising of all elements in ascending order would have zero inversions 
	
	//Now finding the height of the heap
	int n1=n;
	while(n1!=1)
	{
		heap_height++;
		n1=n1/2;
	}
	for(int i=0;i<heap_height;i++)
	{
		height_elements=Math.pow(2,i);
		  if(i==heap_height-1)
			  height_elements=n-height_elements+1;	
		inversions=inversions+((height_elements)*(height_elements-1))/2;
	}
	//This is because to attain maximum inversions we can arrange the nodes at the same height\depth in descending order and if the arrangement of the heap is violated we can swap elements accordingly so that it sets 
	System.out.println("Maximum Inversions="+(int)inversions);
	}
}

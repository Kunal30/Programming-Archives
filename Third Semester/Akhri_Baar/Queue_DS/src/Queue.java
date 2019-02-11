public class Queue {
int array[]=new int[10];
int top=0;
int bottom=0;
public void enqueue(int data)
{
	array[top]=data;
	top++;
	display();
}
public void dequeue()
{
   array[bottom]=0;
   bottom++;
   display();
}
public void display()
{
	for(int i=bottom;i<top;i++)
		System.out.print(" "+array[i]+" ");
	System.out.println();
}
}

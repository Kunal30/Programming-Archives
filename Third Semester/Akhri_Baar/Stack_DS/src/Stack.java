public class Stack {
int array[]=new int[10];
int top=0;
public void push(int item)
{
	array[top]=item;
	top++;
	display();
}
public void pop()
{
	array[top-1]=0;
	top--;
	display();
}
public void display()
{
	for(int i=0;i<top;i++)
		System.out.print(" "+array[i]+" ");
	System.out.println();
}
}

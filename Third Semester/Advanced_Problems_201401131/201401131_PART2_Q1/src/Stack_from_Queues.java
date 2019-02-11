public class Stack_from_Queues {
int popcounter=0;
Queue q1=new Queue();
Queue q2=new Queue();
public void push(Object data)
{   
	if(popcounter%2==0)
	q1.enqueue(data);
	else
	q2.enqueue(data);
}
public void pop()
{  if(popcounter%2==0)
{
	while(q1.size()!=1)
	{
		q2.enqueue(q1.dequeue());
	}
	System.out.print("Item popped=");
    q1.display();
    popcounter++;
}
else
{
	while(q2.size()!=1)
	{
		q1.enqueue(q2.dequeue());
	}
	System.out.print("Item popped=");
    q2.display();
    popcounter++;
}
}
}

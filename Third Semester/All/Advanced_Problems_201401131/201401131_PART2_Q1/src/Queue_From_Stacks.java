import java.util.NoSuchElementException;
public class Queue_From_Stacks {
Stack s1=new Stack();
Stack s2=new Stack();
public void moveStack1ToStack2() {
    while (!s1.isEmpty())
        s2.push(s1.pop());
}
public boolean isEmpty() {
    return s1.isEmpty() && s2.isEmpty();
}
public int size() {
    return s1.size() + s2.size();     
}
public void enqueue(Object item) {
	s1.push(item);
}
public void dequeue() {
    if (isEmpty()) throw new NoSuchElementException("Queue underflow");
    if (s2.isEmpty()) moveStack1ToStack2();
    System.out.println("Item dequeued="+s2.pop());    
}
}
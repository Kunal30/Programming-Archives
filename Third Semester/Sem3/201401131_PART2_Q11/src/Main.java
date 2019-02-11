public class Main {
public static void main(String args[])
{
	Stack s1=new Stack();
	s1.push(1);
	s1.push(2);
	s1.push(3);
	s1.push(4);
	s1.push(5);
	s1.push(7);
	s1.pop();
	Stack s2=new Stack();
	Stack s3=new Stack();
	s1.solve(s1.elements,s1,s2,s3);
	s3.display();
}
}

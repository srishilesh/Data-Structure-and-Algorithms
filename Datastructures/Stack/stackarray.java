import java.util.Stack;

public class stackarray {
	int MAX = 1000;
	int top;
	int a[]= new int[MAX];
	public stackarray()
	{
		top = -1;
	}
	public boolean push(int x)
	{
		if(top>MAX)
		{
			System.out.println("STACK OVERFLOW");
			return false;
		}
		else
		{
			a[++top] = x;
			System.out.println("Pushed "+x+" into the stack");
			return true;
		}
	}
	public int pop()
	{
		if(top<0)
		{
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		else
		{
			int x = a[top--];
			return x;
		}
	}
	public int peek()
	{
		if(top<0)
		{
			System.out.println("STACK UNDERFLOW");
			return 0;
		}
		else
		{
			int x = a[top];
			return x;
		}
	}
	public static void main(String args[])
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("Popping "+s.pop());
		System.out.println("Peeking "+s.peek());
	}
}


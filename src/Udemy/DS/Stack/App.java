package Udemy.DS.Stack;

public class App
{
	public static void main(String[] args)
	{
		StackImpl stack = new StackImpl(5);
		stack.push('c');
		stack.push('d');
		stack.push('e');
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}
}

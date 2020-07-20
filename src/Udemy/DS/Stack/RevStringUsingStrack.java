package Udemy.DS.Stack;

public class RevStringUsingStrack
{
	public static void main(String[] args)
	{		
		String str = "Hello";
		
		StackImpl stack = new StackImpl(str.length());
		
		int i = 0;		
		while(!stack.isFull())
		{
			stack.push(str.charAt(i));
			i++;
		}
		
		String result = "";
		while(!stack.isEmpty())
		{
			result = result+stack.pop();
		}
		
		System.out.println(result);
	}
}

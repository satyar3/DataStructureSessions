package Udemy.DS.Stack;

public class StackImpl
{
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackImpl(int maxSize)
	{
		this.maxSize = maxSize;
		this.stackArray = new char[this.maxSize];
		this.top = -1;
	}
	
	public void push(char val)
	{
		if(!isFull())
		{
			top++;
			stackArray[top] = val;
		}
	}
	
	public char pop()
	{
		if(!isEmpty())
		{
			char temp = stackArray[top];
			top--;		
			return temp;
		}
		else
			return '0';
	}
	
	public char peek()
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (top == maxSize-1);
	}
}	

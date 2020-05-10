package DSClasses.Stacks;

import java.util.ArrayList;

public class StackUsingArrayList
{
	int index;
	ArrayList<Integer> arrList;
	
	public StackUsingArrayList()
	{
		arrList = new ArrayList<>();
		index = -1;
	}
	
	public boolean isEmpty()
	{
		return(index == -1);
	}
	
	public void push(int value)
	{
		arrList.add(value);
		index++;
	}
	
	public int pop()
	{
		if(isEmpty())
			return -1;
		else
		{
			int value = arrList.get(index);
			arrList.remove(index);
			index--;
			return value;
		}
	}
	
	public int peek()
	{
		if(isEmpty())
			return -1;
		else
			return arrList.get(index);
	}
	
	public static void main(String[] args)
	{
		StackUsingArrayList stackList = new StackUsingArrayList();
		System.out.println("Peek : "+stackList.peek());
		System.out.println("Pop : "+stackList.pop());
		stackList.push(8);
		System.out.println("Peek : "+stackList.peek());
		System.out.println("Pop : "+stackList.pop());
		System.out.println("Pop : "+stackList.pop());
	}
	
}

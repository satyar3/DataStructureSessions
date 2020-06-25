package Practice;

import java.util.Arrays;

public class StackUsingArray
{
	int size;
	int index;
	int [] arr;
	
	StackUsingArray(int size)
	{
		this.size = size;
		index = -1;
		arr = new int[this.size];
	}
	
	public boolean isEmpty()
	{
		return (index == -1);
	}
	
	public boolean isFull()
	{
		return (index == arr.length-1);
	}
	
	public void push(int val)
	{
		if(isFull())
			System.out.println("Stack is full");
		else
		{
			index++;
			arr[index] = val;
		}
	}
	
	public int pop()
	{
		if(isEmpty())
			return -1;
		else
		{
			int popVal = arr[index];
			index--;
			return popVal;
		}
	}
	
	public static void main(String[] args)
	{
		StackUsingArray stackArr = new StackUsingArray(5);
		stackArr.push(5);
		System.out.println(Arrays.toString(stackArr.arr));
		stackArr.push(6);
		stackArr.push(7);
		System.out.println(Arrays.toString(stackArr.arr));
		System.out.println(stackArr.pop());
		System.out.println(Arrays.toString(stackArr.arr));
		stackArr.push(9);
		System.out.println(Arrays.toString(stackArr.arr));
	}
}

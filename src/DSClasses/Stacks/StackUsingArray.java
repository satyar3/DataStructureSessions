package DSClasses.Stacks;

public class StackUsingArray
{
	int arr[];
	int size;	
	int index;
	
	
	//Time complexity of all the below method is 0(1)
	public StackUsingArray(int size)
	{
		this.size = size;
		this.arr = new int[size];
		this.index = -1;
	}
	
	public boolean isStackEmpty()
	{
		return(index == -1);
	}
	
	public boolean isStackFull()
	{
		return(size-1 == index);
	}
	
	public int peek()
	{
		if(isStackEmpty())
			return -1;
		else
			return arr[index];
	}
	
	public void push(int element)
	{
		if(isStackFull())
			System.out.println("Stack is full");
		else
		{
			index++;
			arr[index] = element;
			System.out.println("Pushed "+element+" successfully");
			//System.out.println(Arrays.toString(arr));
		}
	}
	
	public int pop()
	{
		if(isStackEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
			
		else
		{
			int tempTop = index;
			index--;
			//System.out.println(Arrays.toString(arr));
			return arr[tempTop];
		}
	}
	
	public static void main(String[] args)
	{
		StackUsingArray stackMap = new StackUsingArray(4);
		if(stackMap.isStackEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
		
		if(stackMap.isStackFull())
			System.out.println("Stack is full");
		else
			System.out.println("Stack is not full");
		
		System.out.println("Pop Stack Map : "+ stackMap.pop());
		stackMap.push(5);
		System.out.println("Pop Stack Map : "+ stackMap.pop());
		
		if(stackMap.isStackEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
		
		if(stackMap.isStackFull())
			System.out.println("Stack is full");
		else
			System.out.println("Stack is not full");
		
		stackMap.push(9);
		stackMap.push(6);
		stackMap.push(7);
		stackMap.push(8);
		
		if(stackMap.isStackEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
		
		if(stackMap.isStackFull())
			System.out.println("Stack is full");
		else
			System.out.println("Stack is not full");
		System.out.println("Pop Stack Map : "+ stackMap.pop());
		System.out.println("Pop Stack Map : "+ stackMap.pop());
		System.out.println("Pop Stack Map : "+ stackMap.pop());
		System.out.println("Pop Stack Map : "+ stackMap.pop());
		System.out.println("Pop Stack Map : "+ stackMap.pop());
		if(stackMap.isStackEmpty())
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
		
		if(stackMap.isStackFull())
			System.out.println("Stack is full");
		else
			System.out.println("Stack is not full");
		stackMap.push(12);
		stackMap.push(13);
		System.out.println("Peek Stack Map : "+ stackMap.peek());
		stackMap.push(14);
		System.out.println("Peek Stack Map : "+ stackMap.peek());
	}
}

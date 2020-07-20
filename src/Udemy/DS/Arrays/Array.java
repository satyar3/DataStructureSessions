package Udemy.DS.Arrays;

public class Array
{
	private int length;
	private int[] arr;
	private int numberOfItems;
	
	public Array(int length)
	{
		this.length = length;
		arr = new int[length];
	}
	
	public void print()
	{
		for(int i = 0; i<numberOfItems;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public void insert(int value)
	{
		if(numberOfItems == length)
		{
			int[] newArr = new int[length*2];
			
			for(int i = 0; i<arr.length; i++)
				newArr[i] = arr[i];
			
			arr = newArr;
		}	

		arr[numberOfItems++] = value;
			
	}
	
	public void deleteAt(int index) throws Exception
	{
		if(index < 0 || index > numberOfItems)
		{
			throw new Exception("Invalid Arrays Index");			
		}
		else
		{
			for(int i = index; i<arr.length-1; i++)
				arr[i] = arr[i+1];

			numberOfItems --;
		}
	}
	
	public void indexOf(int value)
	{
		int val = -1;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == value)
				val = i;
		}
		
		System.err.println("Index is : "+val);
	}
}

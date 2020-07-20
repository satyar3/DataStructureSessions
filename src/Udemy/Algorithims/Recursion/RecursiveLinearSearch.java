package Udemy.Algorithims.Recursion;

public class RecursiveLinearSearch
{
	public static void main(String[] args)
	{
		int[] arr = {9,7,1,3};
		int idx = search(arr, 1, 0);
		System.out.println(idx);
	}
	
	static int search(int[] arr, int val, int i)
	{
		if(i>arr.length-1)
		{
			return -1;
		}
		else if(val == arr[i] )
		{
			return i;
		}
		else
			return search(arr, val, i+1);
	}
}

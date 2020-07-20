package Udemy.Algorithims.Recursion;

public class RecursiveBinarySearch
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6};
		int value = search(arr, 20, 0, arr.length-1);
		System.out.println(value);
	}
	
	static int search(int[] arr, int value, int min, int max)
	{
		if(min>max)
			return -1;
		else
		{
			int mid = (min+max)/2;
			
			if(value == arr[mid])
				return mid;
			else if(value > arr[mid])
			{
				min = mid+1;
				return search(arr, value, min, max);
			}
			else
			{
				max = mid-1;
				return search(arr, value, min, max);
			}
		}
	}
}

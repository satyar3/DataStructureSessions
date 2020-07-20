package Udemy.Algorithims.Search;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int[] arr = {5,9,15,30,35};
		int result = binSearch(arr, 9);
		System.out.println(result);
	}
	
	static int binSearch(int[] arr, int value)
	{
		int front = 0;
		int rear = arr.length-1;
		int mid = (front+rear)/2;
		
		while(front<=rear)
		{
			 mid = (front+rear)/2;
			
			if(arr[mid] == value)
			{
				return mid;
			}
			if(arr[mid] > value)
			{
				rear = mid-1;
			}
			else
			{
				front = mid+1;
			}
		}
		return -1;
	}
}

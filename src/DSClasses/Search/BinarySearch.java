package DSClasses.Search;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int arr[] = {3,4,5,6,7,8};
		int low = 0;
		int high = arr.length-1;
		System.out.println(binarySearch(arr, 9, low, high));
	}
	
	public static int binarySearch(int arr[], int searchVal, int low, int high)
	{
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(arr[mid] == searchVal)
			{
				return mid;
			}
			
			if(arr[mid]>searchVal)
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		return -1;
	}
}

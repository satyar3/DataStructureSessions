package Udemy.Algorithims.Search;

public class LinearSearch
{
	public static void main(String[] args)
	{
		int [] arr = {5,9,6};
		
		int ans = linearSearch(arr, 9);
		System.out.println(ans);
	}
	
	
	//O(n)
	static int linearSearch(int[] arr, int val)
	{
		
		int ans = -1;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == val)
			{	
				ans = i;
				break;							
			}
		}
		
		return ans;
	}
}

package Practice;

import java.util.Arrays;

public class BinSearch
{
	public static void main(String[] args)
	{
		int arr[] = {5,9,2,13,11,6};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int searchNum = 9;
		
		int min = 0;
		int max = arr.length-1;
		
		while(min<=max)
		{
			int mid = (max+min)/2;
			
			if(searchNum == arr[mid])
			{
				System.out.println(mid);
				break;
			}	
			
			if(arr[mid]>searchNum)
			{
				max = mid-1;
			}			
			else
			{
				min = mid+1;
			}						
		}
	}
}

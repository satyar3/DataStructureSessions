package Practice;

import java.util.Arrays;

public class InsertionSort
{
	public static void main(String[] args)
	{
		int[] arr = {3,5,1,4,7};
		
		for(int i = 1; i<arr.length; i++)
		{
			int j = i-1;
			int temp = arr[i];
			
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

package Practice;

import java.util.Arrays;

public class InsertionSort
{
	public static void main(String[] args)
	{
		int[] arr = {4,2,5,6,7,1};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr)
	{
		for(int i = 1; i<arr.length; i++)
		{
			int j = i-1;
			int min = arr[i];
			
			while(j>=0 && arr[j] > min)
			{
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = min;
		}
	}
}

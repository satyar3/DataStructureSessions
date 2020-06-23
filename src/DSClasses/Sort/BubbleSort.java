package DSClasses.Sort;

import java.util.Arrays;

public class BubbleSort
{
	public static void main(String[] args)
	{
		int [] arr = {1,3,2,9,9,7};
		
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0; i<arr.length-1; i++)
		{
			boolean isSwapped = true;
			for(int j = 0; j<arr.length-1-i; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					isSwapped = false;
					swap(arr, j, j+1);
				}
			}
			
			if(isSwapped)
				break;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	private static void swap(int[] arr, int index1, int index2)
	{
		int temp = arr[index2];
		arr[index2] = arr[index1];
		arr[index1] = temp;
	}
}
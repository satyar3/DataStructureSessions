package Practice;

import java.util.Arrays;

public class QuickSort
{
	
	public static void main(String[] args)
	{
		int[] arr = {4,2,5,6,7,1};
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr)
	{
		quickSort(arr, 0, arr.length-1);	
	}

	private static int divide(int[] arr, int min, int max)
	{
		int pivotEl = arr[(min+max)/2];	
		
		while(min<=max)
		{
			while(arr[min] < pivotEl)
			{
				min++;
			}
			
			while(arr[max] > pivotEl)
			{
				max--;
			}
			
			if(min<=max)
			{
				int temp = arr[min];
				arr[min] = arr[max];
				arr[max] = temp;
				
				min++;
				max--;
			}
		}
		return min;
	}
	
	public static void quickSort(int[] arr, int min, int max)
	{
		int pivotEl = divide(arr, min, max);
		
		if(min<pivotEl-1)
			quickSort(arr, min, pivotEl-1);
		if(pivotEl<max)
			quickSort(arr, pivotEl, max);
	}
}

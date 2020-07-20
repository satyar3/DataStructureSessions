package Udemy.Algorithims.Sort;

import java.util.Arrays;

public class QuickSort
{
	public static void main(String[] args)
	{
		int[] arr = {3,7,16,19,12,1,6,20};
		
		QuickSort qa = new QuickSort();
		
		qa.divide(arr, 0, arr.length-1);

		System.out.println(Arrays.toString(arr));
	}
	
	public int sort(int[] arr, int min, int max)
	{
		int pivot = arr[(min+max)/2];
		
		while(min<=max)
		{
			while(arr[min]<pivot)
			{
				min++;
			}
			
			while(arr[max]>pivot)
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
	
	public void divide(int[] arr, int min, int max)
	{
		int pivotEl = sort(arr, min, max);
		
		if(min<pivotEl-1)
			divide(arr, min, pivotEl-1);
		
		if(pivotEl<max)
			divide(arr, pivotEl, max);
	}
}

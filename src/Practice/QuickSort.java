package Practice;

import java.util.Arrays;

public class QuickSort
{
	public static void main(String[] args)
	{
		int[] arr = {2,5,1,5,9};
		QuickSort q = new QuickSort();
		q.sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public int divide(int[] arr, int min, int max)
	{
		int pivot = arr[(min+max)/2];
		
		while(min<=max)
		{
			while(arr[min] < pivot)
			{
				min++;
			}
			
			while(arr[max] > pivot)
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
	
	public void sort(int[] arr, int min, int max)
	{
		int pivotElIdx = divide(arr, min, max);
		
		if(min<pivotElIdx-1)
			sort(arr, min, pivotElIdx-1);
		
		if(pivotElIdx<max)
			sort(arr, pivotElIdx, max);
	}
}

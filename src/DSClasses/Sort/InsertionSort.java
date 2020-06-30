package DSClasses.Sort;

import java.util.Arrays;

public class InsertionSort
{
	static void insertionSort(int[] arr)
	{
		for(int i=1; i<arr.length; i++)
		{
			int temp = arr[i];
			int j = i-1;		
			
			while(j>=0 && arr[j] > temp)
			{				
				arr[j+1] = arr[j];
				j--;
			}	
			arr[j+1] = temp;
		}		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2,15,2,1,6,5};
		insertionSort(arr);
		
	}
}

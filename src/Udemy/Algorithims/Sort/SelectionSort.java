package Udemy.Algorithims.Sort;

import java.util.Arrays;

public class SelectionSort
{
	public static void main(String[] args)
	{
		int[] arr = {4,8,1,9,2,6};
		sort(arr);		
	}
	
	static void sort(int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			int min = i;
			for(int j = i+1; j<arr.length; j++)
			{		
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

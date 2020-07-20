package Udemy.Algorithims.Sort;

import java.util.Arrays;

public class InsertionSort
{
	public static void main(String[] args)
	{
		int[] arr = {9,2,6,1,4};
		insertionSort(arr);
	}
	
	static void insertionSort(int[] arr)
	{
		for(int i = 1; i<arr.length; i++)
		{
			int j = i-1;
			int temp = arr[i];
			while(j >=0 && arr[j] > temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

package Udemy.Algorithims.Sort;

import java.util.Arrays;

public class MergeSort
{
	static int[] resultArr;
	static int[] tempArr;
	
	public static void main(String[] args)
	{
		int[] arr = {4, 5, 1, 8, 2};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr)
	{
		resultArr= arr;
		tempArr = new int[resultArr.length];
		divide(arr, 0, arr.length-1);
	}

	private static void divide(int[] arr, int min, int max)
	{		
		int mid = min+(max-min)/2;
		
		if(min<max)
		{
			divide(arr, min, mid);
			divide(arr, mid+1, max);
			merge(min, mid, max);
		}
	}

	private static void merge(int min, int mid, int max)
	{
		for(int i = 0; i<resultArr.length; i++)
		{
			tempArr[i] = resultArr[i];
		}
		
		int lArrIdx = min;
		int rArrIdx = mid+1;
		int resArrIdx = min;
		
		while(lArrIdx<= mid && rArrIdx<= max)
		{
			if(tempArr[lArrIdx] > tempArr[rArrIdx])
			{
				resultArr[resArrIdx] = tempArr[rArrIdx];
				rArrIdx++;
			}
			else
			{
				resultArr[resArrIdx] = tempArr[lArrIdx];
				lArrIdx++;
			}
			
			resArrIdx++;
		}
		
		while(lArrIdx<= mid)
		{
			resultArr[resArrIdx] = tempArr[lArrIdx];
			lArrIdx++;
			resArrIdx++;
		}
	}
}

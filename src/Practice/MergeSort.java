package Practice;

import java.util.Arrays;

public class MergeSort
{
	int[] resArr;
	int[] tempArr;
	
	public static void main(String[] args)
	{
		int[] arr = {28,84,14,94,15};
		MergeSort m = new MergeSort();
		m.sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public void sort(int[] arr, int min, int max)
	{
		resArr = arr;
		tempArr = new int[resArr.length];
		divide(arr, min, max);
		
	}
	
	public void divide(int[] arr, int min, int max)
	{
		int mid = min+(max-min)/2;
		
		if(min<max)
		{
			divide(arr, min, mid);
			divide(arr, mid+1, max);
			merge(min, mid, max);
		}
	}
	
	public void merge(int min,int mid, int max)
	{
		for(int i = 0; i<resArr.length; i++)
		{
			tempArr[i] = resArr[i];
		}
		
		int lArrIdx = min;
		int rArrIdx = mid+1;
		int resArrIdx = min;
		
		while(lArrIdx<=mid && rArrIdx<=max)
		{
			if(tempArr[lArrIdx] > tempArr[rArrIdx])
			{
				resArr[resArrIdx] = tempArr[rArrIdx];
				rArrIdx++;
			}
			else
			{
				resArr[resArrIdx] = tempArr[lArrIdx];
				lArrIdx++;
			}
			
			resArrIdx++;
		}
		
		while(lArrIdx<=mid)
		{
			resArr[resArrIdx] = tempArr[lArrIdx];
			lArrIdx++;
			resArrIdx++;
		}
	}
}

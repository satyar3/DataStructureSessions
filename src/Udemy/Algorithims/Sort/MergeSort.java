package Udemy.Algorithims.Sort;

import java.util.Arrays;

public class MergeSort
{
	int [] array;
	int len;
	int [] tempArr;
	
	public static void main(String[] args)
	{
		int[] arr = {7,9,3,6,1,10,13};
		
		MergeSort mSort = new MergeSort();		
		mSort.sort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}

	private void sort(int[] arr, int min, int max)
	{
		this.array = arr;
		this.len = arr.length;
		this.tempArr = new int[len];		
		divideAndMegeArray(arr,min,max);
	}
	
	private void divideAndMegeArray(int[] arr, int min, int max)
	{
		int mid = min+(max-max)/2;
		if(min<max)
		{
			sort(arr, min, mid);
			sort(arr, mid+1, max);
			//System.out.println(arr[min]+" "+arr[max]);
			merge(min,mid,max);
		}
	}

	private void merge(int min, int mid, int max)
	{
		for(int i = 0; i<array.length; i++)
		{
			tempArr[i] = array[i];
		}
		
		int leftArrIdx = min;
		int rightArrIdx = mid+1;
		int sortedArrIdx = min;
		
		while(leftArrIdx<=mid && rightArrIdx<=max)
		{
			if(tempArr[leftArrIdx] > tempArr[rightArrIdx])
			{
				array[sortedArrIdx] = tempArr[rightArrIdx];
				rightArrIdx++;
			}
			else
			{
				array[sortedArrIdx] = tempArr[leftArrIdx];
				leftArrIdx++;
			}
			
			sortedArrIdx++;
		}
		
		while(leftArrIdx <= mid)
		{
			array[sortedArrIdx] = tempArr[leftArrIdx];
			leftArrIdx++;
			sortedArrIdx++;
		}
		
		
	}
	
	
}

package Practice;

import java.util.Arrays;

public class BubbleSort
{

	public static void main(String[] args)
	{
		int[] arr = {4,2,5,6,7,1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr)
	{
		for(int i = 0; i<arr.length-1; i++)
		{
			for(int j = 0; j<arr.length-1; j++)
			{
				if(arr[j+1]<arr[j])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

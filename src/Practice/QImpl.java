package Practice;

import java.util.Arrays;

public class QImpl
{
	int size;
	int currentSize;
	//int startIndex;
	int index;
	int[] arr;
	
	public QImpl(int size)
	{
		this.size = size;
		currentSize = 0;
		//startIndex = 0;
		index = -1;
		arr = new int[this.size];
	}
	
	public boolean isEmpty()
	{
		return (currentSize == 0);
	}
	
	public boolean isFull()
	{
		return (currentSize == arr.length);
	}
	
	public void enQ(int val)
	{
		if(isFull())
			System.out.println("Q is full");
		else
		{
			index++;
			arr[index] = val;
			currentSize ++;
		}
	}
	
	public void dQ()
	{
		if(isEmpty())
			System.out.println("Q is empty");
		else
		{
			int dQVal = arr[0];
			//startIndex++;
			currentSize--;
			index--;
			shiftArr(arr);
			System.out.println("dQ val : " + dQVal);
		}
	}
	
	public void shiftArr(int[] arr)
	{
		int index = 0;
		while(index < arr.length - 1)
		{
			arr[index] = arr[index+1];
			index++;
		}
	}
	
	public static void main(String[] args)
	{
		QImpl qImp = new QImpl(4);
		System.out.println(qImp.isEmpty());
		System.out.println(qImp.isFull());
		qImp.dQ();
		qImp.enQ(5);
		System.out.println(Arrays.toString(qImp.arr));
		qImp.dQ();
		System.out.println(Arrays.toString(qImp.arr));
		qImp.enQ(6);
		qImp.enQ(10);
		qImp.enQ(3);
		qImp.enQ(15);
		System.out.println(Arrays.toString(qImp.arr));
		qImp.dQ();
		System.out.println(Arrays.toString(qImp.arr));
		qImp.dQ();
		System.out.println(Arrays.toString(qImp.arr));
		qImp.enQ(16);
		System.out.println(Arrays.toString(qImp.arr));
		qImp.dQ();
		System.out.println(Arrays.toString(qImp.arr));
	}
}

package DSClasses.Queues;

import java.util.Arrays;

public class QueueUsingArrayCorret
{
	int[] arr;
	int size;
	int currentSize;
	int index;
	
	public QueueUsingArrayCorret(int size)
	{
		this.size = size;
		arr = new int[this.size];
		currentSize = 0;
		index = -1;
	}
	
	
	public boolean isEmpty()
	{
		return (currentSize == 0);
	}
	
	public boolean isFull()
	{
		return (currentSize == arr.length-1);
	}
	
	public void enQ(int value)
	{
		if(isFull())
			System.out.println("Q is full");
		else
		{
			index++;
			arr[index] = value;
			currentSize++;
		}
	}
	
	public void deQ()
	{
		if(isEmpty())
			System.out.println("Q is Empty");
		else
		{
			int popValue = arr[0];
			swapValue(arr);
			currentSize--;
			index--;
			
			System.out.println("Dq Val is : "+popValue);
		}
	}
	
	public void swapValue(int[] arr)
	{
		for(int i = 0; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
	}
	
	
	public static void main(String[] args)
	{
		QueueUsingArrayCorret qArrImple = new QueueUsingArrayCorret(6);
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		qArrImple.enQ(4);
		System.out.println(Arrays.toString(qArrImple.arr));
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		qArrImple.deQ();
		System.out.println(Arrays.toString(qArrImple.arr));
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		qArrImple.enQ(5);
		System.out.println(Arrays.toString(qArrImple.arr));
		qArrImple.enQ(6);
		System.out.println(Arrays.toString(qArrImple.arr));
		qArrImple.enQ(99);
		System.out.println(Arrays.toString(qArrImple.arr));
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		qArrImple.deQ();
		System.out.println(Arrays.toString(qArrImple.arr));
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		qArrImple.deQ();
		System.out.println(Arrays.toString(qArrImple.arr));
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		qArrImple.enQ(7);
		System.out.println(Arrays.toString(qArrImple.arr));
		qArrImple.enQ(11);
		System.out.println(Arrays.toString(qArrImple.arr));
		qArrImple.enQ(13);
		System.out.println(Arrays.toString(qArrImple.arr));
		qArrImple.enQ(14);
		System.out.println(Arrays.toString(qArrImple.arr));
		System.out.println("Q is full : "+qArrImple.isFull());
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		qArrImple.deQ();
		System.out.println(Arrays.toString(qArrImple.arr));
	}
}
package DSClasses.Queues;

import java.util.Arrays;

public class QueueUsingArrayCorret
{
	int frontIndex;
	int size;
	int currentSize;
	int[] arr;
	
	QueueUsingArrayCorret(int size)
	{
		currentSize = 0;
		frontIndex = 0;
		this.size = size;
		arr = new int[this.size];
	}
	
	
	public boolean isEmpty()
	{
		if(currentSize == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFull()
	{
		if(currentSize == size)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void enQueue(int val)
	{
		if(!isFull())
		{
			arr[currentSize] = val;
			currentSize++;
			System.out.println("Pushed : "+val);

		}
		else
			System.out.println("Queue is full");
	}
	
	public void deQueue()
	{
		if(!isEmpty())
		{
			if(frontIndex >= currentSize)
			{
				frontIndex = 0;
				currentSize = 0;
				
				System.out.println("Queue is empty");
			}
			else
			{
				System.out.println("Poped : "+arr[frontIndex]);
				frontIndex++;
				currentSize--;
				shiftArray();
			}
		
		}
		else
			System.out.println("Queue is empty");
	}
	
	public void shiftArray()
	{
		int counter = arr.length; 
		int index = 0;
		while(index < counter-1)
		{
			arr[index] = arr[index+1];
			index++;
		}
		frontIndex = 0;
	}
	
	public static void main(String[] args)
	{
	
		QueueUsingArrayCorret qArr = new QueueUsingArrayCorret(4);
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		qArr.enQueue(4);
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println(Arrays.toString(qArr.arr));
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		qArr.deQueue();
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println(Arrays.toString(qArr.arr));
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		qArr.enQueue(5);
		qArr.enQueue(6);
		qArr.enQueue(99);
		System.out.println(Arrays.toString(qArr.arr));
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		qArr.deQueue();
		System.out.println(Arrays.toString(qArr.arr));
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		qArr.deQueue();
		System.out.println(Arrays.toString(qArr.arr));
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		qArr.deQueue();
		System.out.println(Arrays.toString(qArr.arr));
		qArr.enQueue(103);
		System.out.println(Arrays.toString(qArr.arr));
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		qArr.enQueue(7);
		System.out.println(Arrays.toString(qArr.arr));
		qArr.enQueue(11);
		System.out.println(Arrays.toString(qArr.arr));
		qArr.enQueue(13);
		System.out.println(Arrays.toString(qArr.arr));
		qArr.enQueue(14);
		System.out.println(Arrays.toString(qArr.arr));
		System.out.println("Q is full : "+qArr.isFull());
		System.out.println("Q is empty : "+qArr.isEmpty());
		qArr.deQueue();
		System.out.println(Arrays.toString(qArr.arr));
		qArr.deQueue();
		System.out.println(Arrays.toString(qArr.arr));
		qArr.deQueue();
		System.out.println(Arrays.toString(qArr.arr));
	}
}

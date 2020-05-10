package DSClasses.Queues;

import java.util.Arrays;

public class QueueUsingArray
{
	int capacity;	
	int front;
	int rear;
	int arr[];
	int index;
	
	
	public QueueUsingArray(int capacity)
	{
		this.capacity = capacity;
		arr = new int[this.capacity];
		index = -1;
		rear = 0;
		front = 0;
	}
	
	public boolean isEmpty()
	{
		return (index == -1);
	}
	
	public boolean isFull()
	{
		return((rear-front) == capacity);
	}
	
	public void enQueue(int value)
	{
		if(isFull())
			System.err.println("Queue is full");
		else
		{
			index++;
			rear++;	
			if(index == capacity)
				index = 0;
			arr[index] = value;
			System.out.println("Added to Q : "+value);
			//System.out.println("Arr After enQ is : "+Arrays.toString(arr));
		}
	}
	
	public int deQueue()
	{
		if(isEmpty())
		{
			return -1;
		}
		else
		{
			int value = arr[front];
			//arr[front] = 0;
			front++;
			if(front == rear)
			{
				front = 0;
				rear = 0;
				index = -1;
			}
			//System.out.println("Arr is after dQ: "+Arrays.toString(arr));
			return value;
		}		
		
	}
	
	public static void main(String[] args)
	{
		QueueUsingArray qArr = new QueueUsingArray(4);
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		qArr.enQueue(4);
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		System.out.println("D Q is : "+qArr.deQueue());
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		qArr.enQueue(5);
		qArr.enQueue(6);
		qArr.enQueue(99);
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		System.out.println("D Q is : "+qArr.deQueue());
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		System.out.println("D Q is : "+qArr.deQueue());
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		//System.out.println("D Q is : "+qArr.deQueue());
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("Q is full : "+qArr.isFull());
		qArr.enQueue(7);
		qArr.enQueue(11);
		qArr.enQueue(13);
		qArr.enQueue(14);
		System.out.println("Q is full : "+qArr.isFull());
		System.out.println("Q is empty : "+qArr.isEmpty());
		System.out.println("D Q is : "+qArr.deQueue());
		System.out.println("D Q is : "+qArr.deQueue());
		System.out.println("D Q is : "+qArr.deQueue());
	}
}

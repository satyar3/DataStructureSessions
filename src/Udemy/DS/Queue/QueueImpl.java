package Udemy.DS.Queue;

public class QueueImpl
{
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int numberOfItemsInQ;
	
	QueueImpl(int maxSize)
	{
		this.maxSize = maxSize;
		queueArray = new long[maxSize];
		front = 0; //index position of the front element in the array
		rear = -1; //there is no items in the array
		numberOfItemsInQ = 0; //don't have any items in the array		
	}
	
	public void enQ(long val)
	{
		if(!isFull())
		{
			if(rear == maxSize -1)
			{
				rear = -1;
			}
			rear++;
			queueArray[rear] = val;
			numberOfItemsInQ++;
		}
		else
			System.out.println("Queue is full");
	}
	
	public long deQ()
	{
		
		if(!isEmpty())
		{
			long temp = queueArray[front];
			front++;
			if(front == maxSize)
			{
				front = 0; //reinitializing the entire queue again
			}
			numberOfItemsInQ--;
			return temp;
		}
		else
			return -1;
	}
	
	
	public long peek()
	{
		return queueArray[front];
	}
	
	public boolean isEmpty()
	{
		return (numberOfItemsInQ == 0);
	}
	
	public boolean isFull()
	{
		return (numberOfItemsInQ == maxSize);
	}
	
	public void view()
	{
		for(int i = 0; i<queueArray.length; i++)
		{
			System.out.println(queueArray[i]);
		}
	}
	
}

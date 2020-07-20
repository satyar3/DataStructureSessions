package Udemy.DS.Queue;

public class CircularQueue
{
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItmes;
	
	CircularQueue(int maxSize)
	{
		this.maxSize = maxSize;
		queueArray = new long[maxSize];
		front = 0; //index position of the front element in the array
		rear = -1; //there is no items in the array
		nItmes = 0; //don't have any items in the array		
	}
	
	public void enQ(long val)
	{
		if(rear == maxSize -1)
		{
			rear = -1;
		}
		rear++;
		queueArray[rear] = val;
		nItmes++;

	}
	
	public long deQ()
	{

		long temp = queueArray[front];
		front++;
		if(front == maxSize)
		{
			front = 0; //reinitializing the entire queue again
		}
		nItmes--;
		return temp;

	}
	
	
	public long peek()
	{
		return queueArray[front];
	}
	
	public boolean isEmpty()
	{
		return (nItmes == 0);
	}
	
	public boolean isFull()
	{
		return (nItmes == maxSize-1);
	}
	
	public void view()
	{
		for(int i = 0; i<queueArray.length; i++)
		{
			System.out.println(queueArray[i]);
		}
	}
	
}

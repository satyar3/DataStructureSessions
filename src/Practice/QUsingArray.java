package Practice;

public class QUsingArray
{
	int[] arr;
	int front;
	int rear;
	int currentSize;
	int length;

	QUsingArray(int length)
	{
		this.length = length;
		arr = new int[length];
		front = 0;
		rear = -1;
		currentSize = 0;
	}

	public boolean isEmpty()
	{
		return (currentSize == 0);
	}

	public boolean isFull()
	{
		return (currentSize == arr.length);
	}

	public void enQ(int value)
	{
		if (!isFull())
		{
			if (rear == arr.length - 1)
			{
				rear = -1;
			}

			rear++;
			arr[rear] = value;
			currentSize++;
		} else
			System.out.println("Q is full");
	}

	public void deQ()
	{
		if (!isEmpty())
		{
			int temp = arr[front];
			front++;

			if (front == arr.length)
			{
				front = 0;
			}

			currentSize--;
			
			System.out.println(temp);
		} else
			System.out.println("Q is empty");
	}

	public static void main(String[] args)
	{
		QUsingArray q = new QUsingArray(3);
		
		q.deQ();
		
		q.enQ(3);
		
		q.deQ();
		
		q.enQ(5);
		q.enQ(6);
		q.enQ(7);
		
		q.deQ();
		q.deQ();
		
		q.enQ(9);
		q.deQ();
		
		q.deQ();
		
	}
}

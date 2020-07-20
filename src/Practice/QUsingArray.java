package Practice;

public class QUsingArray
{
	int[] arr;
	int size;
	int numberOfItems;
	int front;
	int rear;
	
	public QUsingArray(int size)
	{
		this.size = size;
		arr = new int[size];
		front = 0;
		rear = -1;
		numberOfItems = 0;
	}
	
	public boolean isEmpty()
	{
		return (numberOfItems == 0);
	}
	
	public boolean isFull()
	{
		return (numberOfItems == size);
	}
	
	public void enQ(int val)
	{
		if(!isFull())
		{
			if(rear == size-1)
			{
				rear = -1;
			}
			
			rear++;
			arr[rear] = val;
			numberOfItems++;
		}
		else
			System.out.println("Q is full");
	}
	
	public void deQ()
	{
		if(!isEmpty())
		{
			int temp = arr[front];
			front++;
			
			if(front == size)
			{
				front = 0;
			}
			
			numberOfItems--;
			
			System.out.println(temp);
		}
		else
			System.out.println("Q is Empty");
	}
	
	public static void main(String[] args)
	{
		QUsingArray q = new QUsingArray(3);
		
		q.deQ();
		q.deQ();
		
		q.enQ(3);
		q.deQ();
		
		q.enQ(7);
		q.enQ(8);
		q.enQ(9);
		q.enQ(10);
		q.enQ(11);
		q.deQ();
		q.deQ();
		q.enQ(12);
		q.deQ();
	}
}

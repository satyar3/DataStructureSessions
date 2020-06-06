package DSClasses.Queues;

public class QArrayImplementationNV
{
	int capacity;
	int currentSize;
	int front;
	int rear;
	int arr[];
	
	public QArrayImplementationNV(int capacity)
	{
		this.capacity = capacity;
		front = 0;
		rear = -1;
		arr = new int[this.capacity];
	}
	
	public boolean isEmpty()
	{
		return(currentSize == 0);
	}
	
	public boolean isFull()
	{
		return(currentSize == capacity);
	}
	
	public void enQ(int data)
	{
		if(isFull())
			System.out.println("Q is Full");
		else
		{
			rear++;
			if(rear == capacity-1)
			{
				rear = 0;
			}
			arr[rear] = data;
			System.out.println("Added : "+arr[rear]);
				
			currentSize++;
		}
	}
	
	public void deQ()
	{
		if(isEmpty())
			System.out.println("Q is empty");
		else
		{
			front++;
			if(front == capacity-1)
			{
				System.out.println("Removed : "+arr[front-1]);
				front=0;				
			}
			else
				System.out.println("Removed : "+arr[front-1]);
			
			currentSize--;
		}
	}	
	
	public static void main(String[] args)
	{
		QArrayImplementationNV qArrImple = new QArrayImplementationNV(6);
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		qArrImple.enQ(4);
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		qArrImple.deQ();
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		qArrImple.enQ(5);
		qArrImple.enQ(6);
		qArrImple.enQ(99);
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		qArrImple.deQ();
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		qArrImple.deQ();
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		//System.out.println("D Q is : "+qArr.deQ());
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		System.out.println("Q is full : "+qArrImple.isFull());
		qArrImple.enQ(7);
		qArrImple.enQ(11);
		qArrImple.enQ(13);
		qArrImple.enQ(14);
		System.out.println("Q is full : "+qArrImple.isFull());
		System.out.println("Q is empty : "+qArrImple.isEmpty());
		qArrImple.deQ();
	}
}

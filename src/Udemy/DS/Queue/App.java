package Udemy.DS.Queue;

public class App
{
	public static void main(String[] args)
	{
		QueueImpl q = new QueueImpl(5);
		q.enQ(5);
		q.enQ(6);
		q.enQ(7);
		q.enQ(8);
		q.enQ(9);
		q.enQ(10);
		
		System.out.println(q.deQ());
		System.out.println(q.deQ());
		System.out.println(q.deQ());
		
		q.view();
		
		
		CircularQueue circle = new CircularQueue(5);
		circle.enQ(5);
		circle.enQ(6);
		circle.enQ(7);
		circle.enQ(8);
		circle.enQ(9);
		circle.enQ(10);
		
		System.out.println(circle.deQ());
		System.out.println(circle.deQ());
		System.out.println(circle.deQ());
		
		circle.view();
	}
}

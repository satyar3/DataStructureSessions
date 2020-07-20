package Udemy.DS.LInkedList.CircularLL;

public class App
{
	public static void main(String[] args)
	{
		CircularLinkedList cLL = new CircularLinkedList();
	/*	cLL.insertFirst(20);
		cLL.insertFirst(30);
		cLL.insertFirst(40);
		cLL.insertFirst(50);
		cLL.insertFirst(60);*/
		cLL.insertLast(80);
		cLL.insertLast(90);
		
		cLL.dispList();
		
		/*cLL.deleteFirst();
		
		System.out.println("******************************");
		
		cLL.dispList();*/
	}
}

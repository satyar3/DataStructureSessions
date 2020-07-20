package Udemy.DS.LInkedList.SinglyLL;

public class App
{
	public static void main(String[] args)
	{
		SinglyLinkedList ll = new SinglyLinkedList();
		
		ll.insertFirst(5);
		ll.insertFirst(6);
		ll.insertFirst(7);
		ll.insertLast(66);			
		
		ll.deleteFirst();
		
		ll.displayLinkedList();
	}
}

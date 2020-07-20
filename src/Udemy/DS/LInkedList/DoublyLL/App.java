package Udemy.DS.LInkedList.DoublyLL;

public class App
{
	public static void main(String[] args)
	{
		DoublyLinkedList dLL = new DoublyLinkedList();
		dLL.insertLast(50);
		dLL.insertLast(60);
		dLL.insertLast(70);
		dLL.insertLast(80);
		dLL.deleteKey(60);
		
		dLL.dispForwardList();
		
	}
}

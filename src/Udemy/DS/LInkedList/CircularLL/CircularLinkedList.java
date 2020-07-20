package Udemy.DS.LInkedList.CircularLL;

public class CircularLinkedList
{
	private Node first;
	private Node last;
	
	private boolean isEmpty()
	{
		return (first == null);
	}
	
	public void insertFirst(int value)
	{
		Node node = new Node();
		node.value = value;
		
		if(isEmpty())
		{
			last = node;
		}
		node.next = first;
		first = node;
		
	}

	public void insertLast(int value)
	{
		Node node = new Node();
		node.value = value;
		
		if(isEmpty())
		{
			first = node;
			last = first;
		}
		else
		{
			last.next = node;
			last = node;
		}
	}
	
	public int deleteFirst()
	{
		int temp = first.value;
		
		if(first.next == null)
		{
			last = null;
			
		}

		first = first.next;		
		return temp;
	}
	
	public void dispList()
	{
		Node node = first;
		while(node !=null)
		{
			System.out.println(node.value);
			node = node.next; 
		}
	}
}

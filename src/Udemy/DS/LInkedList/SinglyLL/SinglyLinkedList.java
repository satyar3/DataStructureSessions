package Udemy.DS.LInkedList.SinglyLL;

public class SinglyLinkedList
{
	private Node firstNode;
	
	public SinglyLinkedList()
	{
		firstNode = null;
	}
	
	public boolean isEmpty()
	{
		return (firstNode == null);
	}
	
	//Insert node to the beginning of the linkedlist
	public Node insertFirst(int val)
	{
		Node node = new Node();
		node.value = val;
		node.next = firstNode;
		firstNode = node;
		
		return node;
	}
	
	//Insert node to the end of the linkedlist
	public Node insertLast(int val)
	{
		
		Node currentNode = firstNode;
		while(currentNode.next !=null)
		{
			currentNode = currentNode.next;
		}
		
		Node node = new Node();
		node.value = val;
		currentNode.next = node;
		node.next = null;

		return node;
	}

	//Delete node to the beginning of the linkedlist
	public Node deleteFirst()
	{
		if(!isEmpty())
		{
			Node temp = firstNode;
			firstNode = firstNode.next;

			return temp;
		}
		else
			return null;
	}
	
	public void displayLinkedList()
	{
		while(firstNode !=null)
		{
			firstNode.display();
			firstNode = firstNode.next;
		}
	}
	
	public void deleteNode(Node node)
	{
		node = node.next; 
	}
}

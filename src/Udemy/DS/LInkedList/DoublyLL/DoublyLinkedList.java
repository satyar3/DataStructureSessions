package Udemy.DS.LInkedList.DoublyLL;

public class DoublyLinkedList
{
	Node first;
	Node last;

	DoublyLinkedList()
	{
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty()
	{
		return (first == null);
	}

	public void insertFirst(int value)
	{
		Node node = new Node();
		node.value = value;

		if (isEmpty())
		{
			first = node;
			last = first;
		} else
		{
			first.previous = node;
			node.next = first;
			first = node;
		}
	}

	public void insertLast(int value)
	{
		Node node = new Node();
		node.value = value;

		if (isEmpty())
		{
			first = node;
			last = first;
		} else
		{
			last.next = node;
			node.previous = last;
			last = node;
		}
	}

	//Assume non empty linkedlist
	public Node deleteFirst()
	{
		Node temp = first;
		if (first.next == null)
		{
			first = null;
			last = null;
		} else
		{
			first = first.next;
			first.previous = null;
		}

		return temp;
	}

	//Assume non empty linkedlist
	public Node deletelast()
	{
		Node temp = last;

		if (last.previous == null)
		{
			last = null;
			first = null;
		} else
		{
			last = last.previous;
			last.next = null;
		}

		return temp;
	}

	//Assume non empty linkedlist
	public void insertAfter(int key, int data)
	{
		Node current = first;
		while (current.next != null)
		{
			if (current.value == key)
				break;
			else
				current = current.next;
		}

		Node newNode = new Node();
		newNode.value = data;

		if (current == last)
		{
			current.next = newNode;
			newNode.previous = current;
			newNode.next = null;
			last = newNode;
		} else
		{
			Node temp = current.next;
			current.next = newNode;
			newNode.previous = current;
			newNode.next = temp;
			temp.previous = newNode;
		}
	}

	//Assume non empty linkedlist
	public void deleteKey(int key)
	{
		Node currentNode = first;
		while (currentNode.next != null)
		{
			if (currentNode.value == key)
				break;
			else
				currentNode = currentNode.next;
		}

		if (currentNode == last)
		{
			currentNode = currentNode.previous;
			currentNode.next = null;
			last = currentNode;
		} else if (currentNode == first)
		{
			currentNode = currentNode.next;
			currentNode.previous = null;
			first = currentNode;
		} else
		{
			Node temp = currentNode.previous;			
			currentNode = temp;
			currentNode.next = temp.next.next;
		}
		
		
	}
	
	public void dispForwardList()
	{
		Node node = first;
		while(node !=null)
		{
			node.displayValue();
			node = node.next;
		}
	}
	
	public void dispBackWardList()
	{
		Node node = last;
		while(node !=null)
		{
			node.displayValue();
			node = node.previous;
		}
	}
}

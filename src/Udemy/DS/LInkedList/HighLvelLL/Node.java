package Udemy.DS.LInkedList.HighLvelLL;

public class Node
{
	Node nextNode = null;
	int value;
	
	Node(int value)
	{
		this.value = value;
	}
	
	public static int listLength(Node node)
	{
		int counter = 0;
		while(node !=null)
		{
			node = node.nextNode;
			counter++;
		}
		
		return counter;
	}
	
	public static void listConent(Node node)
	{
		while(node !=null)
		{
			System.out.println(node.value);
			node = node.nextNode;
		}
	}
	
	public static Node add(Node node, int value)
	{
		Node temp = node.nextNode;
		node.nextNode = new Node(value);
		Node insertedNode = node.nextNode;
		insertedNode.nextNode = temp;
		
		return insertedNode;
	}
}

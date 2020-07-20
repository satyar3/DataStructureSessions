package Udemy.DS.LInkedList.HighLvelLL;

public class LLImpl
{
	public static void main(String[] args)
	{
		Node nodeA = new Node(3);
		Node nodeB = new Node(4);
		Node nodeC = new Node(5);
		Node nodeD = new Node(6);
		
		nodeA.nextNode = nodeB;
		nodeB.nextNode = nodeC;
		nodeC.nextNode = nodeD;
		System.out.println(Node.listLength(nodeB));
		Node insertedNode = Node.add(nodeB, 23);
		System.out.println("Inserted Node Value :: "+insertedNode.value);
		System.out.println(Node.listLength(nodeB));
		Node.listConent(nodeB);		
	}	
}

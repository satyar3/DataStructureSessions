package Practice;

public class StackUsingLL
{
	Node node;
	
	class Node
	{
		int val;
		Node headNode;
		
		Node(int val)
		{
			this.val = val;
			headNode = null;
		}
	}
	
	public void push(int val)
	{
		Node tempNode = node;
		node = new Node(val);
		node.headNode = tempNode;
	}
	
	public void pop()
	{
		int nodeVal = node.val;
		node = node.headNode;	
		System.out.println(nodeVal);
	}
	
	
	public static void main(String[] args)
	{
		StackUsingLL ll = new StackUsingLL();
		ll.push(5);
		System.out.println("CUrrent Node Value "+ll.node.val+" and head node is : "+ll.node.headNode);
		ll.push(6);
		ll.push(7);
		System.out.println("CUrrent Node Value "+ll.node.val+" and head node is : "+ll.node.headNode.val);
		ll.pop();
		System.out.println("CUrrent Node Value "+ll.node.val+" and head node is : "+ll.node.headNode.val);
	}
}

package DSClasses.Stacks;

public class StackUsingLinkedList
{
	Block block;
	
	class Block
	{
		int value;
		Block head;
	}
	
	StackUsingLinkedList()
	{
		block = null;
	}
	
	public void push(int value)
	{
		Block tempHead = block;
		block = new Block();
		block.value = value;
		block.head = tempHead;
	}
	
	public int pop()
	{
		if(block == null)
			return -1;
		else
		{
			int val = block.value;
			block = block.head;
			return val;
		}
	}
	
	public void getAllData(Block block)
	{
		while(block != null)
		{
			System.out.println("Block Value : "+block.value);
			block = block.head;
		}
	}
	
	public static void main(String[] args)
	{
		StackUsingLinkedList ll = new StackUsingLinkedList();
		System.out.println("Pop Value : "+ll.pop());
		ll.push(5);
		ll.push(9);
		ll.push(10);
		ll.getAllData(ll.block);
		System.out.println("Pop Value : "+ll.pop());
		System.out.println("Pop Value : "+ll.pop());
		
	}
}

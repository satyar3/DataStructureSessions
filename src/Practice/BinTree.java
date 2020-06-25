package Practice;

public class BinTree
{
	class Node
	{
		Node rootNode;
		Node rightNode;
		Node LeftNode;
		int value;

		Node(int value)
		{
			this.value = value;
		}
	}

	public Node treeInit()
	{
		Node node30 = new Node(30);

		Node node40 = new Node(40);
		Node node50 = new Node(50);

		Node node70 = new Node(70);
		Node node80 = new Node(80);

		Node node90 = new Node(90);
		Node node100 = new Node(100);

		node30.LeftNode = node40;
		node30.rightNode = node50;

		node40.LeftNode = node70;
		node40.rightNode = node80;

		node50.LeftNode = node90;
		node50.rightNode = node100;

		return node30;
	}

	public void getTreeDataPreOrder(Node rootNode)
	{
		if (rootNode != null)
		{
			
			getTreeDataPreOrder(rootNode.LeftNode);
			System.out.println(rootNode.value);
			getTreeDataPreOrder(rootNode.rightNode);
			
		}
	}

	public static void main(String[] args)
	{
		BinTree t = new BinTree();
		Node n = t.treeInit();

		t.getTreeDataPreOrder(n);
	}

}

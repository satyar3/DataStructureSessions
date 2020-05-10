package DSClasses.Tree;

public class BinaryTreePostOrder
{
	class TreeNode
	{
		TreeNode node;
		TreeNode right;
		TreeNode left;
		int value;
		
		TreeNode(int val)
		{
			this.value = val;
		}
	}	
	
	public TreeNode initializeTree()
	{
		TreeNode rootNoot = new TreeNode(20);
		rootNoot.left = new TreeNode(30);
		rootNoot.right = new TreeNode(40);
		
		TreeNode node30 = rootNoot.left;
		node30.left = new TreeNode(60);
		node30.right = new TreeNode(70);
		
		TreeNode node40 = rootNoot.right;
		node40.left = new TreeNode(80);
		node40.right = new TreeNode(90);
		
		return rootNoot;
	}
	
	public void getDataFomTree(TreeNode node)
	{
		if(node !=null)
		{
			getDataFomTree(node.left);
			getDataFomTree(node.right);
			System.out.println(node.value);
			
		}
	}
	
	public static void main(String[] args)
	{
		BinaryTreePostOrder tree = new BinaryTreePostOrder();
		TreeNode node = tree.initializeTree();
		tree.getDataFomTree(node);
	}
}

package src.tree.com;

public class TreeNode {
	TreeNode left;
	TreeNode right;
	int value;
	boolean visited;
	int getValue()
	{
		return value;
	}
	public TreeNode(TreeNode left, TreeNode right, int value)
	{
		this.left = left;
		this.right = right;
		this.value = value;
	}
}

package src.entity.com;

public class TreeNode {
	TreeNode left;
	TreeNode right;
	int value;
	boolean visited;
	public int getValue()
	{
		return value;
	}
	public TreeNode(TreeNode left, TreeNode right, int value)
	{
		this.left = left;
		this.right = right;
		this.value = value;
	}
	public TreeNode getLeft()
	{
		return left;
	}
	public TreeNode getRight()
	{
		return right;
	}
	public void setLeft(TreeNode left)
	{
		this.left = left;
	}
	public void setRight(TreeNode right)
	{
		this.right = right;
	}
	public boolean getVisited()
	{
		return visited;
	}
	public void setVisited(boolean visited)
	{
		this.visited = visited;
	}
}

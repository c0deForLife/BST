package src.tree.com;

import java.util.List;

import src.entity.com.TreeNode;

public class BinarySearchTree {
	public TreeNode root ;
	public void insertNode(TreeNode start,TreeNode tNode)
	{
		if(tNode != null)
		{
			if(start == null)
			{
				start = tNode;
				root = start;
			}
			else
			{
				int rootValue = start.getValue();
				int currValue = tNode.getValue();
				if(currValue < rootValue)
				{
					if(start.getLeft() == null)
						start.setLeft(tNode);
					else
						insertNode(start.getLeft(), tNode);
				}
				else
				{
					if(start.getRight() == null)
						start.setRight(tNode);
					else
						insertNode(start.getRight(), tNode);
				}
			}
		}
	}
	public void displayPreorder(TreeNode r,List<Integer> e)
	{
		//Inorder
		if(r != null)
		{
			//System.out.println((r.value));
			e.add(r.getValue());
			displayPreorder(r.getLeft(),e);
			displayPreorder(r.getRight(),e);
		}
	}
	public TreeNode dfs(TreeNode r, TreeNode n)
	{
		if(n!=null && r!=null && !r.getVisited())
		{
			TreeNode tn = r;
			tn.setVisited(true);
			if(tn.getValue() == n.getValue())
			{
				System.out.println("FOUND");
				return r;
			}
			else
				System.out.println(r.getValue());
			TreeNode left = tn.getLeft();
			TreeNode retNode = dfs(left, n);
			if(retNode == null)
			{
				TreeNode right = tn.getRight();
				dfs(right, n);
			}
		}
		return null;
	}
	
}

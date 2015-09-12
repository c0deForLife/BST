package src.entity.com;

import java.util.ArrayList;
import java.util.List;

import src.tree.com.BinarySearchTree;
import src.tree.com.TreeNode;
public class BinarySearchTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		TreeNode tn = new TreeNode(null,null,10); 
		bst.insertNode(bst.root, tn);
		TreeNode tn1 = new TreeNode(null,null,6); 
		bst.insertNode(bst.root, tn1);
		TreeNode tn2 = new TreeNode(null,null,4); 
		bst.insertNode(bst.root, tn2);
		TreeNode tn3 = new TreeNode(null,null,7); 
		bst.insertNode(bst.root, tn3);
		TreeNode tn4 = new TreeNode(null,null,13); 
		bst.insertNode(bst.root, tn4);
		TreeNode tn5 = new TreeNode(null,null,1); 
		bst.insertNode(bst.root, tn5);
		TreeNode tn6 = new TreeNode(null,null,2); 
		bst.insertNode(bst.root, tn6);
		TreeNode tn7 = new TreeNode(null,null,23); 
		bst.insertNode(bst.root, tn7);
		//bst.displayPreorder(bst.root);
		bst.dfs(bst.root, new TreeNode(null, null, 1));
		List<Integer> ele = new ArrayList<Integer>();
		bst.displayPreorder(bst.root,ele);
		System.out.println("List items = \n");
		System.out.println(ele.toString());
	}

}

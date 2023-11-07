package com.tree.app;

import com.tree.service.BinaryTreeSumServiceImpl;


public class BinaryTreeSumApp {
	 public static void main(String[] args) {
	        BinaryTreeSumServiceImpl tree = new BinaryTreeSumServiceImpl();
	        tree.root =tree.new TreeNode(40);
	        tree.root.left = tree.new TreeNode(20);
	        tree.root.right = tree.new TreeNode(60);
	        tree.root.left.left =tree.new TreeNode(10);
	        tree.root.left.right = tree.new TreeNode(30);
	        tree.root.right.left = tree.new TreeNode(50);
	        tree.root.right.right = tree.new TreeNode(70);

	        int targetSum = 70; // Change this to the desired sum

	        if (!tree.findPair(tree.root, targetSum)) {
	            System.out.println("No pair found with the sum " + targetSum);
	        }
	    }

}

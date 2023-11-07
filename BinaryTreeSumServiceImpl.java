package com.tree.service;

import java.util.Stack;


public class BinaryTreeSumServiceImpl implements BinaryTreeSumService {
	public class TreeNode {
	    int val;
	    public TreeNode left;
		public TreeNode right;

	    public TreeNode(int val) {
	        this.val = val;
	        this.left = this.right = null;
	    }
	}
	public TreeNode root;

    // Function to find a pair with the given sum in BST
    public boolean findPair(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        TreeNode left = root, right = root;
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();

        while (true) {
            while (left != null) {
                leftStack.push(left);
                left = left.left;
            }
            while (right != null) {
                rightStack.push(right);
                right = right.right;
            }

            if (leftStack.isEmpty() || rightStack.isEmpty() || leftStack.peek() == rightStack.peek()) {
                break;
            }

            int leftVal = leftStack.peek().val;
            int rightVal = rightStack.peek().val;

            if (leftVal + rightVal == targetSum) {
                System.out.println("Pair found: " + leftVal + " + " + rightVal + " = " + targetSum);
                return true;
            }

            if (leftVal + rightVal < targetSum) {
                left = leftStack.pop().right;
            } else {
                right = rightStack.pop().left;
            }
        }

        return false;
    }

}

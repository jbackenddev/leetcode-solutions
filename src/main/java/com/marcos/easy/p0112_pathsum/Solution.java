package com.marcos.easy.p0112_pathsum;

import com.marcos.javalib.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }

        return traverseTree(root, targetSum, root.val);
    }

    private boolean traverseTree(TreeNode node, int targetSum, int sum) {
        if (node.left == null && node.right == null) {
            return targetSum == sum;
        }

        if (node.left != null && traverseTree(node.left, targetSum, sum + node.left.val)) {
            return true;
        }

        return node.right != null && traverseTree(node.right, targetSum, sum + node.right.val);
    }
}

package com.marcos.javalib;

public class TreeNodeService {
    private TreeNodeService() {}

    public static TreeNode mapToTreeNode(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            return null;
        }

        TreeNode[] nodes = new TreeNode[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                nodes[i] = new TreeNode(arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (nodes[i] != null) {
                int leftIndex = 2 * i + 1;
                int rightIndex = 2 * i + 2;

                if (leftIndex < arr.length) {
                    nodes[i].left = nodes[leftIndex];
                }
                if (rightIndex < arr.length) {
                    nodes[i].right = nodes[rightIndex];
                }
            }
        }

        return nodes[0];
    }
}

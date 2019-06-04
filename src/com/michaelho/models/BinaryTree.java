package com.michaelho.models;

public class BinaryTree {
    public TreeNode root;

    /**
     * Constructor for initialize a tree from an array in level order.
     *
     * @param array The array represents nodes in level order.
     * */
    public BinaryTree(Integer[] array) {
        if (array.length == 0) {
            return;
        }
        root = insertLevelOrder(array, root, 0);
    }

    private TreeNode insertLevelOrder(Integer[] arr, TreeNode localRoot, int i) {
        if (i < arr.length) {
            if (arr[i] == null) {
                return null;
            }
            localRoot = new TreeNode(arr[i]);
            localRoot.left = insertLevelOrder(arr, localRoot.left, 2 * i + 1);
            localRoot.right = insertLevelOrder(arr, localRoot.right, 2 * i + 2);
        }
        return localRoot;
    }
}

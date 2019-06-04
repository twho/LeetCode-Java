package com.michaelho.easy.to200;

import com.michaelho.models.TreeNode;

public class _104_MaxDepthBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

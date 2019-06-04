package com.michaelho.medium.to200;

import com.michaelho.models.TreeNode;

class _0106_ConstructBTInorderPostorder {

    TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    private TreeNode buildTree(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd) {
        if (inorder.length == 0 || postorder.length == 0) {
            return null;
        }
        if (iStart == iEnd && pStart == pEnd) {
            return new TreeNode(inorder[iEnd]);
        }
        TreeNode root = new TreeNode(postorder[pEnd]);
        outif: if (iStart < iEnd && pStart < pEnd) {
            int rootIdx = -1;
            for (int i = iStart; i <= iEnd; i++) {
                if (inorder[i] == postorder[pEnd]) {
                    rootIdx = i;
                    break;
                }
            }
            if (rootIdx == -1) {
                break outif;
            }
            if (rootIdx-1 >= iStart && rootIdx-1 >= pStart) {
                root.left = buildTree(inorder, iStart, rootIdx-1, postorder, pStart, pStart + rootIdx - 1 - iStart);
            }
            if (rootIdx+1 <= iEnd) {
                root.right = buildTree(inorder, rootIdx+1, iEnd, postorder, pStart + rootIdx - iStart, pEnd-1);
            }
        }
        return root;
    }
}

package com.michaelho.medium.to200;

import com.michaelho.models.TreeNode;

class _0105_ConstructBTPreorderInorder {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    private TreeNode buildTree(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        if (iStart == iEnd && pStart == pEnd) {
            return new TreeNode(inorder[iStart]);
        }

        TreeNode root = new TreeNode(preorder[pStart]);
        int inorderRootIdx = -1;
        outif: if (iStart < iEnd && pStart < pEnd) {
            for (int i = iStart; i <= iEnd; i++) {
                if (preorder[pStart] == inorder[i]) {
                    inorderRootIdx = i;
                    break;
                }
            }
            if (inorderRootIdx == -1) {
                break outif;
            }
            if (inorderRootIdx-1 >= iStart) {
                root.left = buildTree(preorder, pStart+1, pStart+inorderRootIdx-iStart, inorder, iStart, inorderRootIdx-1);
            }

            if (inorderRootIdx+1 <= iEnd) {
                root.right = buildTree(preorder, pStart+inorderRootIdx-iStart+1, pEnd, inorder, inorderRootIdx+1, iEnd);
            }
        }
        return root;
    }
}

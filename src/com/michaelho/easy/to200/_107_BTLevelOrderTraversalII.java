package com.michaelho.easy.to200;

import com.michaelho.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

class _107_BTLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        levelOrderBottom(root, 0, output);
        return output;
    }

    private void levelOrderBottom(TreeNode root, int index, List<List<Integer>> output) {
        if (root == null) {
            return;
        }

        if (index < output.size()) {
            output.get(output.size() - index - 1).add(root.val);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            output.add(0, list);
        }
        levelOrderBottom(root.left, index+1, output);
        levelOrderBottom(root.right, index+1, output);
    }
}

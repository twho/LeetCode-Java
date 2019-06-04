package com.michaelho.easy.to200;

import com.michaelho.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _0113_PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(root, sum, current, output);
        return output;
    }

    private void helper(TreeNode root, int sum, List<Integer> current, List<List<Integer>> output) {
        if (root == null) {
            return;
        }

        List<Integer> temp = new ArrayList<>(current);
        temp.add(root.val);
        if (root.val == sum && root.left == null && root.right == null) {
            output.add(temp);
        } else {
            helper(root.left, sum - root.val, temp, output);
            helper(root.right, sum - root.val, temp, output);
        }
    }
}

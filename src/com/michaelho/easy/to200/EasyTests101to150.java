package com.michaelho.easy.to200;

import com.michaelho.models.BinaryTree;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EasyTests101to150 {

    @Test
    public void testPathSum() {
        _0112_PathSum sol = new _0112_PathSum();
        BinaryTree binaryTree1 = new BinaryTree(new Integer[] {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, null, 1});
        assertTrue(sol.hasPathSum(binaryTree1.root, 22));

        BinaryTree binaryTree2 = new BinaryTree(new Integer[] {-2, null, -3});
        assertTrue(sol.hasPathSum(binaryTree2.root, -5));
    }

    @Test
    public void testPathSumII() {
        _0113_PathSumII sol = new _0113_PathSumII();
        BinaryTree binaryTree = new BinaryTree(new Integer[] {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1});
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(5, 4, 11, 2),
                Arrays.asList(5, 8, 4, 5)
        );
        List<List<Integer>> output = sol.pathSum(binaryTree.root, 22);
        assertEquals(expected.size(), output.size());
        assertTrue(expected.containsAll(output) && output.containsAll(expected));
    }

    @Test
    public void testMaxDepthBinaryTree() {
        _104_MaxDepthBinaryTree sol = new _104_MaxDepthBinaryTree();
        BinaryTree tree = new BinaryTree(new Integer[] {
                3,
                9, 20,
                null, null, 15, 7
        });
        int expected = 3;
        assertEquals(expected, sol.maxDepth(tree.root));
    }

    @Test
    public void testBTLevelOrderTraversalII() {
        _107_BTLevelOrderTraversalII sol = new _107_BTLevelOrderTraversalII();
        BinaryTree tree = new BinaryTree(new Integer[] {
                3,
                9, 20,
                null, null, 15, 7
        });
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(15,7),
                Arrays.asList(9, 20),
                Arrays.asList(3)
        );
        List<List<Integer>> output = sol.levelOrderBottom(tree.root);
        assertEquals(expected.size(), output.size());
        assertTrue(expected.containsAll(output) && output.containsAll(expected));
    }
}

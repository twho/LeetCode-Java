package com.michaelho.medium.to200;

import com.michaelho.models.BinaryTree;
import com.michaelho.utils.Utils;
import org.junit.Test;

import static org.junit.Assert.*;

public class MediumTests101to150 {

    @Test
    public void testConstructBTByInorderAndPostorder1() {
        _0106_ConstructBTInorderPostorder sol = new _0106_ConstructBTInorderPostorder();
        int[] inorder = new int[] { 9, 3, 15, 20, 7 };
        int[] postorder = new int[] { 9, 15, 7, 20, 3 };
        BinaryTree expected = new BinaryTree(new Integer[] {
                3,
                9, 20,
                null, null, 15, 7
        });
        assertEquals(Utils.inOrderTraversal(expected.root), Utils.inOrderTraversal(sol.buildTree(inorder, postorder)));
        assertNull(sol.buildTree(new int[0], new int[0]));
    }

    @Test
    public void testConstructBTByInorderAndPostorder2() {
        _0106_ConstructBTInorderPostorder sol = new _0106_ConstructBTInorderPostorder();
        int[] inorder = new int[] { 1, 2, 3, 4 };
        int[] postorder = new int[] { 4, 3, 2, 1 };
        BinaryTree expected = new BinaryTree(new Integer[] {
                1,
                null, 2,
                null, null, null, 3,
                null, null, null, null, null, null, null, 4
        });
        assertEquals(Utils.inOrderTraversal(expected.root), Utils.inOrderTraversal(sol.buildTree(inorder, postorder)));
    }

    @Test
    public void testConstructBTByPrederAndInorder() {
        _0105_ConstructBTPreorderInorder sol = new _0105_ConstructBTPreorderInorder();
        int[] inorder = new int[] { 9, 3, 15, 20, 7 };
        int[] preorder = new int[] { 3, 9, 20, 15, 7 };
        BinaryTree expected = new BinaryTree(new Integer[] {
                3,
                9, 20,
                null, null, 15, 7
        });
        assertEquals(Utils.inOrderTraversal(expected.root), Utils.inOrderTraversal(sol.buildTree(preorder, inorder)));
        assertNull(sol.buildTree(new int[0], new int[0]));
    }
}

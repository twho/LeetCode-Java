package com.michaelho.utils;

import com.michaelho.models.ListNode;
import com.michaelho.models.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {

    public static void printDescription(String s, Object obj) { print(s + obj); }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void printLinkedList(ListNode head) {
        ListNode node = head;

        int count = 0;
        while (node != null) {
            Utils.print(count + ": " + node.val);
            count ++;
            node = node.next;
        }
    }

    public static void printList(List list) {
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static String inOrderTraversal(TreeNode root) {
        String output = "";
        if (root != null) {
            output += inOrderTraversal(root.left);
            output += " " + root.val;
            output += inOrderTraversal(root.right);
        }
        return output;
    }
}

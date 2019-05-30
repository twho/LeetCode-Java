package com.michaelho.utils;

import com.michaelho.models.ListNode;

public class Utils {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void printLinkedListFromHead(ListNode head) {
        ListNode node = head;

        int count = 0;
        while (node != null) {
            Utils.print(count + ": " + node.val);
            count ++;
            node = node.next;
        }
    }
}

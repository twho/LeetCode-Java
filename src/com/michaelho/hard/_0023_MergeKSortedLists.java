package com.michaelho.hard;

import com.michaelho.models.ListNode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * LeetCode: https://leetcode.com/problems/merge-k-sorted-lists/
 * */
public class _0023_MergeKSortedLists {

    ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode node = lists[i];

            while (node != null) {
                list.add(node.val);
                node = node.next;
            }
        }

        if (list.size() == 0) {
            return null;
        }
        Collections.sort(list);
        ListNode node = new ListNode(list.get(0));
        ListNode head = node;
        for (int i = 1; i < list.size(); i++) {
            node.next = new ListNode(list.get(i));
            node = node.next;
        }
        return head;
    }
}

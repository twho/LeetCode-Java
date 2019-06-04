package com.michaelho.medium.to100;

import com.michaelho.models.ListNode;

/**
 * LeetCode: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * */
class _0019_RemoveNthNodeFromEndList {

    /**
     * Method that uses pointers. The runner node is used to calculate the gap between current fast and slow cursors.
     * When the fast cursor reaches to the end, the slow one points at the previous node of the node to be deleted.
     * */
    ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode node = newHead;
        ListNode runner = newHead;
        while (n>0) {
            runner = runner.next;
            n--;
        }
        while (runner.next!=null) {
            runner = runner.next;
            node = node.next;
        }
        node.next = node.next.next;
        return newHead.next;
    }
}

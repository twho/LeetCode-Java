package com.michaelho.easy.to300;

import com.michaelho.models.ListNode;

class _0206_ReverseLinkedList {

    ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode node = head;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}

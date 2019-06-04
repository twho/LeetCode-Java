package com.michaelho.medium.to100;

import com.michaelho.models.ListNode;

class _0002_AddTwoNumbers {

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        int val = l1.val + l2.val;
        ListNode head = new ListNode(val%10);
        boolean shouldAdd = val > 9;
        ListNode node = head;

        while (l1.next != null || l2.next != null) {
            int currentVal = 0;
            if (l1.next != null) {
                currentVal += l1.next.val;
            }

            if (l2.next != null) {
                currentVal += l2.next.val;
            }

            node.next = new ListNode((currentVal + (shouldAdd ? 1 : 0))%10);
            shouldAdd = currentVal > 9;
            l1 = l1.next;
            l2 = l2.next;
            node = node.next;
        }

        if (shouldAdd) {
            node.next = new ListNode(1);
        }
        return head;
    }
}

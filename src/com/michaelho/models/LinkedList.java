package com.michaelho.models;

import com.michaelho.utils.Utils;

public class LinkedList {
    public ListNode head;

    public LinkedList(int[] array) {
        if (array.length < 1) {
            return;
        }
        ListNode node = new ListNode(array[0]);
        head = node;
        if (array.length < 2) {
            return;
        }
        for (int i = 1; i < array.length; i++) {
            node.next = new ListNode(array[i]);
            node = node.next;
        }
    }

    public boolean equalsFromHead(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode other = head;
        ListNode current = this.head;

        if (current.val != other.val) {
            return false;
        }

        while (current.next != null && other.next != null) {
            if (current.next.val != other.next.val) {
                return false;
            }
            current = current.next;
            other = other.next;
        }
        return !(current.next != null || other.next != null);
    }

    public void printAll() {
        ListNode node = head;

        int count = 0;
        while (node != null) {
            Utils.print(count + ": " + node.val);
            count ++;
            node = node.next;
        }
    }
}

package com.michaelho.hard;

import com.michaelho.models.LinkedList;
import com.michaelho.models.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HardTests1to50 {

    @Test
    public void testAddTwoNumbers() {
        _0023_MergeKSortedLists sol = new _0023_MergeKSortedLists();
        ListNode[] listNodes = new ListNode[] {
                new LinkedList(new int[]{1, 4, 5}).head,
                new LinkedList(new int[]{1, 3, 4}).head,
                new LinkedList(new int[]{2, 6}).head
        };
        LinkedList expected = new LinkedList(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        assertTrue(expected.equalsFromHead(sol.mergeKLists(listNodes)));
    }
}

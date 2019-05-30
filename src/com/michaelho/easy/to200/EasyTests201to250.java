package com.michaelho.easy.to200;

import com.michaelho.models.LinkedList;
import com.michaelho.models.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EasyTests201to250 {

    @Test
    public void testReverseLinkedList() {
        _0206_ReverseLinkedList sol = new _0206_ReverseLinkedList();
        ListNode input = (new LinkedList(new int[]{1, 2, 3, 4, 5})).head;
        ListNode output = sol.reverseList(input);
        ListNode expected = (new LinkedList(new int[]{5, 4, 3, 2, 1})).head;
        while (expected != null) {
            assertEquals(expected.val, output.val);
            expected = expected.next;
            output = output.next;
        }
    }
}

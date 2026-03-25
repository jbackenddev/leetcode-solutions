package com.marcos.easy.p0083_removeduplicatesfromsortedlist;

import com.marcos.javalib.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        int currentValue = current.val;

        while(current != null) {
            while (current.next != null && current.next.val == currentValue) {
                current.next = current.next.next;
            }

            if (current.next != null) {
                currentValue = current.next.val;
            }

            current = current.next;
        }

        return head;
    }
}

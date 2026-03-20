package com.marcos.easy.removeduplicatesfromsortedlist;

import com.marcos.lib.ListNode;

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



    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(3)));
        ListNode node = new Solution().deleteDuplicates(head);

        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}

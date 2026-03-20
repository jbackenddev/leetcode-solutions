package com.marcos.easy.addtwonumbers;

import com.marcos.lib.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode resultNext;

        ListNode next1 = l1;
        ListNode next2 = l2;
        int vai1 = 0;

        if (next1 != null && next2 != null) {
            int sum = next1.val + next2.val + vai1;

            if (sum >= 10) {
                vai1 = 1;
                sum = sum - 10;
            }

            result = new ListNode(sum);

            next1 = next1.next;
            next2 = next2.next;
        }

        resultNext = result;

        do {
            if (next1 != null && next2 != null) {
                int sum = next1.val + next2.val + vai1;
                vai1 = 0;

                if (sum >= 10) {
                    vai1 = 1;
                    sum = sum - 10;
                }

                resultNext.next = new ListNode(sum);
                resultNext = resultNext.next;

                next1 = next1.next;
                next2 = next2.next;
            } else if(next1 != null) {
                int sum = next1.val + vai1;
                vai1 = 0;

                if (sum >= 10) {
                    vai1 = 1;
                    sum = sum - 10;
                }

                resultNext.next = new ListNode(sum);
                resultNext = resultNext.next;

                next1 = next1.next;
            } else if(next2 != null) {
                int sum = next2.val + vai1;
                vai1 = 0;

                if (sum >= 10) {
                    vai1 = 1;
                    sum = sum - 10;
                }

                resultNext.next = new ListNode(sum);
                resultNext = resultNext.next;

                next2 = next2.next;
            }
        } while(next1 != null || next2 != null);

        if (vai1 != 0) {
            resultNext.next = new ListNode(vai1);
        }

        return result;
    }
}
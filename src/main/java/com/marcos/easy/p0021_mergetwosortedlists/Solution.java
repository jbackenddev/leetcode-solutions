package com.marcos.easy.p0021_mergetwosortedlists;

import com.marcos.javalib.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 != null && list2 == null) {
            return list1;
        }

        if (list2 != null && list1 == null) {
            return list2;
        }

        ListNode listNext = new ListNode();
        ListNode listHead = listNext;

        while (list1 != null && list2 != null) {
            if (list1.val == list2.val) {
                listNext.next = new ListNode(list1.val, new ListNode(list2.val));
                listNext = listNext.next.next;
                list1 = list1.next;
                list2 = list2.next;
            } else if (list1.val < list2.val) {
                listNext.next = new ListNode(list1.val);
                listNext = listNext.next;
                list1 = list1.next;
            } else {
                listNext.next = new ListNode(list2.val);
                listNext = listNext.next;
                list2 = list2.next;
            }
        }

        if (list1 != null) {
            listNext.next = list1;
        }

        if (list2 != null) {
            listNext.next = list2;
        }

        listHead = listHead.next;

        return listHead;
    }

}
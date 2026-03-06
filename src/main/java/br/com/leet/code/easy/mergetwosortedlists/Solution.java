package br.com.leet.code.easy.mergetwosortedlists;

import br.com.leet.code.lib.ListNode;

import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {

        //ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        //ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5))));

        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();

        ListNode head = new Solution().mergeTwoLists(null, null);

        List<Integer> flatMap = new ArrayList<>();

        while(head != null) {
            flatMap.add(head.val);
            head = head.next;
        }

        System.out.println(flatMap);
    }
}
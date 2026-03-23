package com.marcos.javalib;

public class ListNodeService {
    private ListNodeService() {}

    public static ListNode mapToListNode(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            return null;
        }

        ListNode root = new ListNode(arr[0]);

        ListNode current = root;

        for(int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return root;
    }
}

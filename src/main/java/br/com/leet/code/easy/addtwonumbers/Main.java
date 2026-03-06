package br.com.leet.code.easy.addtwonumbers;

import br.com.leet.code.lib.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(8));
        ListNode l2 = new ListNode(0);

        ListNode result = new Solution().addTwoNumbers(l1, l2);

        do {
            System.out.print(result.val + ",");
            result = result.next;
        } while(result != null);
    }
}
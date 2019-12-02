package 剑指offer._14链表中倒数第k个结点;

import _剑指offer.util.ListNode;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int total = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            total++;
        }
        if (k > total) {
            return null;
        }
        ListNode res = head;
        for (int i = 0; i < total - k; i++) {
            res = res.next;
        }
        return res;
    }
}

package 剑指offer._3;

import leetcode.reverse_linked_list.ListNode;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if (listNode == null) {
            return res;
        }
        ListNode pre = new ListNode(0);
        while (listNode != null) {
            pre = listNode.next;
            res.add(0, listNode.val);
            listNode.next = pre;
            listNode = pre;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println(new Solution().printListFromTailToHead(head));
    }
}

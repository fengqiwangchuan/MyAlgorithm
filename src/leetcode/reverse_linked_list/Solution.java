package leetcode.reverse_linked_list;

public class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
//        当前结点的下一个节点将成为当前节点的上一个节点 重复操作
//        input  1 2 3 4 5 null
//        output 5 4 3 2 1 null
        ListNode tmp = null;
        while (head != null) {
//          暂存下一个节点 用于向后遍历
            tmp = head.next;
//          获得当前节点的前驱 实现反转
            head.next = prev;
//          prev保存当前节点 当前结点为下一个节点的 前驱
            prev = head;
//          遍历下一个 2
            head = tmp;
        }
//          最后一轮prev指向原链表的最后一个节点 即反转链表的头
        return prev;
    }


    public static ListNode reverseList(ListNode head, int m, int n) {
        if (m == n || head == null) {
            return head;
        }
        ListNode tmp = null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p=dummy;
        for (int i = 0; i < m - 1; i++) {
            p = p.next;
        }
//          p.next此时为开始反转的位置
        ListNode tail = p.next;
        for (int i = m; i < n; i++) {
            tmp = p.next;
            p.next = tail.next;
            tail.next = tail.next.next;
            p.next.next = tmp;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode reverseHead = reverseList(head, 2, 3);
        while (reverseHead != null) {
            System.out.print(reverseHead.val+" ");
            reverseHead = reverseHead.next;
        }
    }
}

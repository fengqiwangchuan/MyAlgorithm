package leetcode.sort;

import leetcode.reverse_linked_list.ListNode;

public class Solution {

    public static ListNode insertSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head.next;
        ListNode start = new ListNode(0);
        start.next = head;
        while (p != null) {
//            p指向当前结点的后继节点
//            tmp指向当前结点
            ListNode tmp = start.next;
//            指向前驱的pre
            ListNode pre = start;
//            找到插入位置
            System.out.println(tmp != p && p.val >= tmp.val);
            while (tmp != p && p.val >= tmp.val) {
                tmp = tmp.next;
//                让tmp指向当前节点的后继节点 循环判断
                pre = pre.next;
//                pre指向当前结点的前驱节点
            }
            if (tmp == p) {
//                说明当前节点值小于后继节点值 升序正确 不用交换
                head = p;
            } else {
//                进行交换
                head.next = p.next;
                p.next = tmp;
                pre.next = p;
            }
            p = head.next;
        }
        head = start.next;
        return head;
    }

    public static ListNode getPartition(ListNode start, ListNode end) {
        int key = start.val;
        ListNode p = start;
        ListNode tmp = new ListNode(0);
        for (ListNode i = start.next; i != end; i = i.next) {
            if (i.val < key) {
                p = p.next;
                tmp.val = i.val;
                i.val = p.val;
                p.val = tmp.val;
            }
        }
        tmp.val = p.val;
        p.val = start.val;
        start.val = tmp.val;
        return p;
    }

    public static void quickSortHelper(ListNode head, ListNode tail) {
        if (head != tail && head.next != tail) {
            ListNode mid = getPartition(head, tail);
            quickSortHelper(head, mid);
            quickSortHelper(mid.next, tail);
        }
    }

    public static ListNode quickSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        quickSortHelper(head, null);
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(1);
//        ListNode sort = insertSort(head);
        ListNode sort = quickSort(head);
        while (sort != null) {
            System.out.print(sort.val + " ");
            sort = sort.next;
        }
    }
}

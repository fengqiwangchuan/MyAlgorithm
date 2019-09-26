package leetcode._2_add_two_numbers;

import leetcode._time.MyTime;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        int l1_len = 0;
        ListNode cur1 = new ListNode(0);
        ListNode cur2 = new ListNode(0);
        cur1.next = l1;
        cur2.next = l2;
        while (l1 != null) {
            l1_len++;
            l1 = l1.next;
        }
        l1 = cur1.next;
        int l2_len = 0;
        while (l2 != null) {
            l2_len++;
            l2 = l2.next;
        }
        l2 = cur2.next;
        if (l1_len > l2_len) {
            int[] _add = new int[l1_len];
            for (int i = 0; i < l2_len; i++) {
                res.val = l1.val + l2.val + _add[i];
                if (res.val >= 10) {
                    _add[i + 1] = 1;
                }
                res = res.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            res.val = l1.val + _add[l1_len - 1];
        } else if (l1_len < l2_len) {
            int[] _add = new int[l2_len];
            for (int i = 0; i < l1_len; i++) {
                res.val = l1.val + l2.val + _add[i];
                if (res.val >= 10) {
                    _add[i + 1] = 1;
                }
                res = res.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            res.val = l2.val + _add[l2_len - 1];
        } else {
            int[] _add = new int[l1_len + 1];
            for (int i = 0; i < l1_len; i++) {
                res.val = l1.val + l2.val + _add[i];
                if (res.val >= 10) {
                    _add[i + 1] = 1;
                }
                res = res.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            res.val = l2.val + _add[l2_len];
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        long start = MyTime.Start();
        ListNode res = new Solution().addTwoNumbers(l1, l2);
        long end = MyTime.End();
        System.out.println("用时:" + (end - start));
        while (res != null) {
            System.out.print(res.val + "->");
            res = res.next;
        }
    }
}

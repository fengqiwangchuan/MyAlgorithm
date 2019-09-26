#  148.sort list解题思路
数据结构基础:八大排序三大查找
1. 插入排序：直接插入排序，希尔排序 
2. 选择排序：选择排序，堆排序 
3. 交换排序：冒泡排序，快速排序 
4. 归并排序：归并排序

##  1.直接插入排序
*  时间复杂度O(n^2)
*  空间复杂度O(1)
*  稳定

   input 4 2 1 3

   第一次交换
   
   2 4 1 3
   
   第二次交换
   
   1 2 4 3
   
   第三次交换
   
   1 2 3 4
   
可以看出向后迭代并与之前的进行比较 然后按照排序规则直接插入

```
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
```

##  2.快速排序
*  时间复杂度 最好是 O(n*log2(n))
              最坏是 O(n^2)
*  空间复杂度 O(log2(n))
*  不稳定  相同值次序可能会改变

   选择一个基准 这里是 header 比他小的放在左边 大的放在右边
   
   接着递归分组
   
```
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
```

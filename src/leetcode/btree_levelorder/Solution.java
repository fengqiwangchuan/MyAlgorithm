package leetcode.btree_levelorder;

import java.util.*;

public class Solution {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int count = queue.size();
            while (count > 0) {
                root = queue.poll();
                level.add(root.val);
                if (root.left != null) {
                    queue.add(root.left);
                }
                if (root.right != null) {
                    queue.add(root.right);
                }
                count--;
            }
            lists.add(level);
        }
        return lists;
    }

    public static List<TreeNode> preOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> list = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            list.add(root);
            if (root.left != null ) {
                queue.add(root.left);
                preOrder(root.left);
            }
            if (root.right != null ) {
                queue.add(root.right);
                preOrder(root.right);
            }
        }
        return list;
    }

    public static List < TreeNode > inOrder(TreeNode root) {
        List < TreeNode > res = new ArrayList < > ();
        Stack < TreeNode > stack = new Stack< >();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr);
            curr = curr.right;
        }
        return res;
    }

    public static List<TreeNode> postOrder(TreeNode root) {
        LinkedList<TreeNode> res = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (root == null) {
            return res;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
//            取顶端节点
            root = stack.pollLast();
//            倒序添加
            res.addFirst(root);
            if (root.left != null) {
                stack.add(root.left);
            }
            if (root.right != null) {
                stack.add(root.right);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
//        List<List<Integer>> lists = levelOrder(root);
//        List<TreeNode> lists = preOrder(root);
//        List<TreeNode> lists = inOrder(root);
        List<TreeNode> lists = postOrder(root);
        for (TreeNode list : lists) {
            System.out.print(list+" ");
        }
    }

}

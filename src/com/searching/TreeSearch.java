package com.searching;

public class TreeSearch {
    public static void main(String[] args) {
        int[] arr = { 15, 10, 20, 8, 12, 17, 25 };
        int target = 17;
        TreeNode root = buildBST(arr);
        TreeNode result = treeSearch(root, target);
        if (result != null) {
            System.out.println("Element found: " + result.value);
        } else {
            System.out.println("Element not found in the tree.");
        }
    }

    public static class TreeNode {
        int value;
        TreeNode left, right;

        TreeNode(int item) {
            value = item;
            left = right = null;
        }
    }

    public static TreeNode buildBST(int[] arr) {
        TreeNode root = null;
        for (int value : arr) {
            root = insertIntoBST(root, value);
        }
        return root;
    }

    public static TreeNode insertIntoBST(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.value) {
            root.left = insertIntoBST(root.left, value);
        } else if (value > root.value) {
            root.right = insertIntoBST(root.right, value);
        }
        return root;
    }

    public static TreeNode treeSearch(TreeNode root, int target) {
        // Base Cases: root is null or target is present at root
        if (root == null || root.value == target) {
            return root;
        }

        // Target is greater than root's value
        if (target > root.value) {
            return treeSearch(root.right, target);
        }

        // Target is smaller than root's value
        return treeSearch(root.left, target);
    }
}

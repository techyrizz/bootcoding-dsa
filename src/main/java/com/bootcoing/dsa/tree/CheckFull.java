package com.bootcoing.dsa.tree;

public class CheckFull {
    public static TreeNode Create() {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(5);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        return root;
    }
    public static boolean isFull(TreeNode root){
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        return (root.left != null && root.right != null) && isFull(root.left)&&(isFull(root.right));
    }
    public static void main(String[] args) {
        TreeNode root = Create();
        System.out.println("The given Tree is -> " + isFull(root));

    }
}

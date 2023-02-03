package com.bootcoing.dsa.tree;
public class Order {

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
 public static void preOrder(TreeNode root){
        if (root == null)
            return;

     System.out.println(root.data);
     preOrder(root.left);
     preOrder(root.right);

 }
    public static void inOrder(TreeNode root){
        if (root == null)
            return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);

    }

    public static void post(TreeNode root){
        if (root == null)
            return;

        post(root.left);
        post(root.right);
        System.out.println(root.data);

    }
    public static void main(String[] args) {
        TreeNode root = Create();
        System.out.println("In-Order");
        inOrder(root);
        System.out.println("Pre-Order");
        preOrder(root);

        System.out.println("Post-Order");
        post(root);

    }



}

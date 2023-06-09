package com.company;

public class Subtree {
    public static boolean isSubTree(PreOrder.Node root, PreOrder.Node subRoot){

        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isValid(root,subRoot)){
                return true;
            }
        }

        return isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot);
    }

    public static boolean isValid(PreOrder.Node root, PreOrder.Node subRoot) {
        if(root == null && subRoot == null){
            return true;
        }else if(root == null || subRoot == null || root.data != subRoot.data){
            return false;
        }
        if(!isValid(root.left,subRoot.left)){
            return false;
        }
        if(!isValid(root.right,subRoot.right)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PreOrder.Node root = new PreOrder.Node(1);
        root.left = new PreOrder.Node(2);
        root.right = new PreOrder.Node(3);
        root.left.left = new PreOrder.Node(4);
        root.left.right = new PreOrder.Node(5);
        root.right.left = new PreOrder.Node(6);
        root.right.right = new PreOrder.Node(7);

        PreOrder.Node subRoot = new PreOrder.Node(2);
        subRoot.left = new PreOrder.Node(4);
        subRoot.right = new PreOrder.Node(5);

        System.out.println(isSubTree(root,subRoot));

    }
}

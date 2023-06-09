package com.company;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class PreOrder {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class BinaryTree{
        static int idx = -1;
        public static Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;

        }

        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }
        public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static int count(Node root){
            if(root == null){
                return 0;
            }
            int L = count(root.left);
            int R = count(root.right);
            return L+R+1;
        }

        public static int sumNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftSum = sumNodes(root.left);
            int rightSum = sumNodes(root.right);

            return leftSum+rightSum+root.data;
        }
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int leftH = height(root.left);
            int rightH = height(root.right);

            if(leftH > rightH){
                return leftH + 1;
            }else{
                return rightH + 1;
            }
        }

        public static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int left = diameter(root.left);
            int right = diameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);
            int max = Math.max(rh+lh+1, Math.max(right,left));
            return max;
        }
        public static class TreeInfo{
            int h;
            int diam;

            public TreeInfo(int h,int diam){
                this.h = h;
                this.diam = diam;
            }

        }
        public static TreeInfo diameter2(Node root){
            if(root == null){
                return new TreeInfo(0,0);
            }
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);

            int myHeight = Math.max(left.h,right.h) + 1;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.h + right.h + 1;

            int myDiam = Math.max(Math.max(diam1,diam2),diam3);

            return new TreeInfo(myHeight,myDiam);
        }

    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println(tree.diameter2(root).diam);

    }
}

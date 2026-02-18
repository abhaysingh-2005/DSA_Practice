package codewithTree;

import java.util.LinkedList;
import java.util.Queue;

public class Kth_level_of_a_Tree {
    public static class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }
    public void printAllnodes(Node root,int k){
        if(root ==null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        int a=1;
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);          // null ka mtlb yaha hai ki next level aa gye hai. Therefore a++;
                    a++;
                }
            }
            else{
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
                if(a==k){
                    System.out.print(currNode.value+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        Kth_level_of_a_Tree obj=new Kth_level_of_a_Tree();
        int k=3;
        obj.printAllnodes(root,k);
    }
}







/* 2nd way */

//package codewithTree;        // O(n)
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Kth_level_of_a_Tree {
//    public static class Node{
//        int value;
//        Node left;
//        Node right;
//
//        Node(int value){
//            this.value=value;
//            this.left=null;
//            this.right=null;
//        }
//    }
//    public void printAllnodes(Node root,int level,int k){
//        if(root==null ){
//            return ;
//        }
//        if(level==k){
//            System.out.print(root.value+" ");
//            return;
//        }
//        printAllnodes(root.left,level+1,k);
//        printAllnodes(root.right,level+1,k);
//
//    }
//    public static void main(String[] args) {
//        Node root=new Node(1);
//        root.left=new Node(2);
//        root.right=new Node(3);
//        root.left.left=new Node(4);
//        root.left.right=new Node(5);
//        root.right.left=new Node(6);
//        root.right.right=new Node(7);
//        Kth_level_of_a_Tree obj=new Kth_level_of_a_Tree();
//        int k=3;
//        int level =1;
//        obj.printAllnodes(root,level,k);
//    }
//}

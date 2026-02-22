package codewithTree;

public class Kth_ancestor_of_node {
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
    public int kth_ancestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.value==n){
            return 0;
        }

        int left_count=kth_ancestor(root.left,n,k);
        int right_count=kth_ancestor(root.right,n,k);
        if(left_count ==-1 && right_count==-1){
            return -1;
        }

        int distance= Math.max(left_count,right_count)+1;
        if(distance==k){
            System.out.println("Kth ancestor:"+root.value);
        }
        return distance;

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        Kth_ancestor_of_node obj=new Kth_ancestor_of_node();
        int n=7;
        obj.kth_ancestor(root,n,1);
    }
}










/* 2nd way to gfg or leetcode oriented */


//package codewithTree;
//
//public class Kth_ancestor_of_node {
//    public static class Node{
//        int value;
//        Node left;
//        Node right;
//        Node(int value){
//            this.value=value;
//            this.left=null;
//            this.right=null;
//        }
//    }
//    public int findKthAncestor(Node root, int n, int k){
//        ans=-1;
//        kth_ancestor(root,n,k);
//        return ans;
//    }
//    static int ans=-1;
//    public int kth_ancestor(Node root,int n,int k){
//        if(root==null){
//            return -1;
//        }
//        if(root.value==n){
//            return 0;
//        }
//
//        int left_count=kth_ancestor(root.left,n,k);
//        int right_count=kth_ancestor(root.right,n,k);
//        if(left_count ==-1 && right_count==-1){
//            return -1;
//        }
//
//        int distance= Math.max(left_count,right_count)+1;
//        if(distance==k){
//            ans= root.value;
//        }
//        return distance;
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
//        Kth_ancestor_of_node obj=new Kth_ancestor_of_node();
//        int n=7;
//        int ancestor=obj.findKthAncestor(root,n,1);
//        System.out.println("Kth ancestor of :"+ancestor);
//    }
//}
package codewithBinaryTree;

public class Transform_to_sum_tree {
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
    public int totalSum(Node root){
        if(root==null){
            return 0;
        }
        int left_Sum=totalSum(root.left);
        int right_Sum=totalSum(root.right);
        int oldValue=root.value;
        root.value=left_Sum+right_Sum;
        return oldValue+ root.value;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        Transform_to_sum_tree obj=new Transform_to_sum_tree();
        obj.totalSum(root);
        System.out.println(root.value);
    }
}






















/*  Leetcode or gfg oriented */

//package codewithBinaryTree;
//
//public class Transform_to_sum_tree {
//    public static class Node {
//        int value;
//        Node left;
//        Node right;
//
//        Node(int value) {
//            this.value = value;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    public int total_Sum(Node root) {
//        helper(root);
//        return root.value;
//    }
//
//    public int helper(Node root) {
//        if (root == null) {
//            return 0;
//        }
//        int left_Sum = helper(root.left);
//        int right_Sum = helper(root.right);
//        int oldValue = root.value;
//        root.value = left_Sum + right_Sum;
//        return oldValue + root.value;
//    }
//
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//        Transform_to_sum_tree obj = new Transform_to_sum_tree();
//        System.out.println(obj.total_Sum(root));
//    }
//}

/*  Tc=O(n) and Sc= O(h)*/


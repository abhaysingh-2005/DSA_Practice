package codewithBinaryTree;

public class Maximum_path_sum_in_a_Binary_tree {
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
    static int Maxsum=Integer.MIN_VALUE;    // Agar sare node negative hua toh... Math.max(-2145483648,-5)=-5....
    public int findSum(Node root){
        if(root==null){
            return 0;
        }
        int left_count=Math.max(0,findSum(root.left));   // Negative ignore krne ke lia
        int right_count=Math.max(0,findSum(root.right));
        int current=left_count+right_count+ root.value;
        Maxsum=Math.max(Maxsum,current);
        return root.value+Math.max(left_count,right_count);
    }
    public static void main(String[] args) {

        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        Maximum_path_sum_in_a_Binary_tree obj=new Maximum_path_sum_in_a_Binary_tree();
        int a=obj.findSum(root);
        System.out.println(a);
        System.out.println(Maxsum);

    }
}

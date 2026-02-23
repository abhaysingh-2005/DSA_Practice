package codewithBinaryTree;

public class Sum_of_Nodes {
    public static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int left_sum = sum(root.left);
        int right_sum = sum(root.right);
        return left_sum + right_sum + root.value;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        Sum_of_Nodes obj=new Sum_of_Nodes();
        System.out.println(obj.sum(root));
    }
}

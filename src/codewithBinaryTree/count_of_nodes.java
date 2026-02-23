package codewithBinaryTree;

public class count_of_nodes {
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
        public int nodecount(Node root) {
            if (root == null) {
                return 0;
            }
            int left_count = nodecount(root.left);
            int right_count = nodecount(root.right);
            return left_count + right_count + 1;
        }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new count_of_nodes.Node(2);
        root.right=new count_of_nodes.Node(3);
        root.left.left=new count_of_nodes.Node(4);
        root.left.right=new count_of_nodes.Node(5);
        root.right.left=new count_of_nodes.Node(6);
        root.right.right=new count_of_nodes.Node(7);
        count_of_nodes obj=new count_of_nodes();
        System.out.println(obj.nodecount(root));
    }
}

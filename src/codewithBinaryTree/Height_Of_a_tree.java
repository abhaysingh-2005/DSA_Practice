package codewithBinaryTree;

public class Height_Of_a_tree {
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
    public static class heightoftree {
        public int height(Node root) {
            if (root == null) {
                return 0;
            } else {
                int left_height = height(root.left);
                int right_height = height(root.right);
                return Math.max(left_height, right_height) + 1;
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
        heightoftree ht=new heightoftree();

        System.out.println(ht.height(root));


    }
}












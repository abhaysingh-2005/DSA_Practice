package codewithBinaryTree;

public class Diameter_of_a_Tree {
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
    public int diameter(Node root){
        if(root==null){
            return 0;
        }
        int left_diameter=diameter(root.left);
        int left_height=height(root.left);
        int right_diameter=diameter(root.right);
        int right_height=height(root.right);

        int selfDiam= left_height + right_height + 1;
        return Math.max(selfDiam,Math.max(left_diameter,right_diameter));
    }
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        Diameter_of_a_Tree objD=new Diameter_of_a_Tree();
        System.out.println(objD.diameter(root));
    }
}

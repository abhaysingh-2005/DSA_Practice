package codewithBinarySearchTree;

public class Mirror_a_BST {
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
    public Node formMirror(Node root){
        if(root==null){
            return null;
        }
        root.left=formMirror(root.left);
        root.right=formMirror(root.right);
        Node temp=root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(10);
        root.right.right=new Node(11);
        Mirror_a_BST obj=new Mirror_a_BST();
        System.out.print("Real:");
        obj.preOrder(root);
        obj.formMirror(root);
        System.out.println();
        System.out.print("Mirror:");
        obj.preOrder(root);

    }
}

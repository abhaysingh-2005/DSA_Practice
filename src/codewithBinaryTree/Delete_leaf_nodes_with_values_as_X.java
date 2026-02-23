package codewithBinaryTree;

public class Delete_leaf_nodes_with_values_as_X {
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
    public Node removeLeaf(Node root, int k){
        if(root==null){
            return null;
        }
        root.left=removeLeaf(root.left,k);
        root.right=removeLeaf(root.right,k);
        if(root.left==null && root.right==null && root.value==k){    // delete krne hai isiliye null kr rhe return -1 ya return 0 krte toh vo delete nhi krte...
            return null;   // yaha root=null; krte fir root return krte isse ache pehla hi return null krdo..
        }
        return root;
    }

    public void preOrder(Node root) {     //O(n)
        if (root == null) {
            return;
        } else {
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(3);
        root.right=new Node(3);
        root.left.left=new Node(3);
        root.left.right=new Node(2);
        Delete_leaf_nodes_with_values_as_X obj=new Delete_leaf_nodes_with_values_as_X();
        obj.removeLeaf(root,3);
        obj.preOrder(root);

    }
}











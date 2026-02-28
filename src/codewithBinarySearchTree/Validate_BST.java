package codewithBinarySearchTree;

public class Validate_BST {
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

    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.value+" ");
        inOrder(root.right);
    }

    public boolean isValid(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null &&root.value<=min.value){
            return false;
        }
        if(max!=null && root.value>=max.value){
            return false;
        }
        return isValid(root.left,min,root) && isValid(root.right,root,max);
    }
    public static void main(String[] args) {

        /*  Example 1 */
//        Node root=new Node(5);
//        root.left=new Node(3);
//        root.left.left=new Node(1);
//        root.left.right=new Node(4);
//        root.right=new Node(6);
//        root.right.right=new Node(7);

        /*   Example 2  */

        Node root=new Node(3);
        root.left=new Node(2);
        root.left.left=new Node(1);
        root.left.right=new Node(4);
        root.right=new Node(5);

        Validate_BST obj=new Validate_BST();
        obj.inOrder(root);
        System.out.println();
        Node min=null;
        Node max=null;
        if(obj.isValid(root,min,max)){
            System.out.println("VALID");
        }
        else{
            System.out.println("NOT VALID");
        }
    }
}

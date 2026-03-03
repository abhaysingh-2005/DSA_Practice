package codewithBinarySearchTree;
import java.util.*;

public class Convert_BST_to_Balanced_BST {
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
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root, ArrayList<Integer> inOrder){
        if(root==null){
            return;
        }
        inOrder(root.left,inOrder);
        inOrder.add(root.value);
        inOrder(root.right,inOrder);
    }


    public Node createBST(ArrayList<Integer> inOrder,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(inOrder.get(mid));
        root.left=createBST(inOrder,start,mid-1);
        root.right=createBST(inOrder,mid+1,end);
        return root;
    }
    public Node balanceBST(Node root){      // TC: O(n)
        ArrayList<Integer> inOrder=new ArrayList<>();
        Convert_BST_to_Balanced_BST obj=new Convert_BST_to_Balanced_BST();
        /*  inOrder Sequence */
        obj.inOrder(root,inOrder);

        /*  sorted inorder -> balanced BST  */
        root=createBST(inOrder,0,inOrder.size()-1);
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);

        Convert_BST_to_Balanced_BST obj=new Convert_BST_to_Balanced_BST();
        System.out.print("BST:");
        obj.preOrder(root);
        System.out.println();
        System.out.print("Balanced BST:");
        root=obj.balanceBST(root);
        obj.preOrder(root);


    }
}

package codewithBinarySearchTree;

public class Sorted_array_to_Balanced_BST {
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
    public Node createBST(int [] arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr,start,mid-1);
        root.right=createBST(arr,mid+1,end);
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
        int [] arr={3,5,6,8,10,11,12};
        int start=0;
        int end=arr.length-1;
        Sorted_array_to_Balanced_BST obj=new Sorted_array_to_Balanced_BST();
        Node root=obj.createBST(arr,start,end);
        obj.preOrder(root);

    }
}

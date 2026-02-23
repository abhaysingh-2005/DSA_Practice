package codewithBinarySearchTree;

public class Build_a_BST {
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
    public Node insert(Node root,int val){
        if(root==null){
            Node newNode=new Node(val);
            root=newNode;
            return root;
        }
        if(val< root.value){     // left mea insert
            root.left=insert(root.left,val);
        }
        else{                  // right mea insert
            root.right=insert(root.right,val);
        }
        return root;
    }

    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.value+" ");
        inOrder(root.right);

    }
    public static void main(String[] args) {
        int [] values={5,1,3,4,2,7};
        Node root=null;
        Build_a_BST obj=new Build_a_BST();
        for(int i=0;i< values.length;i++){
            root=obj.insert(root,values[i]);
        }
        obj.inOrder(root);
        System.out.println();
    }
}





















/* It is also correct */

//package codewithBinarySearchTree;
//
//public class Build_a_BST {
//    public static class Node{
//        int value;
//        Node left;
//        Node right;
//        Node(int value){
//            this.value=value;
//            this.left=null;
//            this.right=null;
//        }
//    }
//    public Node insert(Node root,Node newNode) {
//        if(root==null){
//            root=newNode;
//            return root;
//        }
//        if(newNode.value<root.value){
//            root.left=insert(root.left,newNode);
//            return root;
//        }
//        else{
//            root.right=insert(root.right,newNode);
//            return root;
//        }
//    }
//    public void inOrder(Node root){
//        if(root==null){
//            return;
//        }
//        inOrder(root.left);
//        System.out.print(root.value+" ");
//        inOrder(root.right);
//
//    }
//    public static void main(String[] args) {
//        int [] values={5,1,3,4,2,7};
//        Node root=null;
//        Build_a_BST obj=new Build_a_BST();
//        for(int i=0;i<values.length;i++){
//            Node newNode=new Node(values[i]);
//            root=obj.insert(root,newNode);
//        }
//        obj.inOrder(root);
//        System.out.println();
//    }
//}

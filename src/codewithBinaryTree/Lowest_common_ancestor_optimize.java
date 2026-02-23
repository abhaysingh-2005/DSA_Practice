package codewithBinaryTree;

public class Lowest_common_ancestor_optimize {
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
    public Node LCA(Node root, int n1,int n2){
        if(root==null){
            return null;
        }
        if(root.value==n1 || root.value==n2){
            return root;
        }
        Node foundleft=LCA(root.left,n1,n2);
        Node foundright=LCA(root.right,n1,n2);
        if(foundleft==null){
            return foundright;
        }
        if(foundright==null){
            return foundleft;
        }
        return root;
    }
    public boolean exist(Node root, int n){
        if(root==null){
            return false;
        }
        if(root.value==n){
            return true;
        }
        boolean foundleft=exist(root.left,n);
        boolean foundright=exist(root.right,n);
        if(foundleft || foundright){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        int n1=4;
        int n2=6;
        Lowest_common_ancestor_optimize obj=new Lowest_common_ancestor_optimize();
        if(obj.exist(root,n1) && obj.exist(root,n2)){
            System.out.println(obj.LCA(root,n1,n2).value);
        }
        else{
            System.out.println("One or both node not present in tree");
        }
    }
}

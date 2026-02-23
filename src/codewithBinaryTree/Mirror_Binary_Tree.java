package codewithBinaryTree;

public class Mirror_Binary_Tree {
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
    public boolean isMirror(Node root1, Node root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
       boolean left_check=isMirror(root1.left,root2.right);
       boolean right_check=isMirror(root1.right,root2.left);
       if(root1.value==root2.value && left_check && right_check){  // Jab teeno true hoge tab return true hogaa...
           return true;
       }
       else{
           return false;
       }

    }
    public static void main(String[] args) {
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.left.left=new Node(4);
        root1.left.right=new Node(5);
        root1.right=new Node(3);
        root1.right.left=new Node(6);
        root1.right.right=new Node(7);


        Node root2=new Node(1);
        root2.left=new Node(3);
        root2.left.left=new Node(7);
        root2.left.right=new Node(6);
        root2.right=new Node(2);
        root2.right.left=new Node(5);
        root2.right.right=new Node(4);
        Mirror_Binary_Tree obj=new Mirror_Binary_Tree();
        System.out.println(obj.isMirror(root1,root2));

    }
}

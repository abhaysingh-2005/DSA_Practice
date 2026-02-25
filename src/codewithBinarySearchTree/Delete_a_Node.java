package codewithBinarySearchTree;

public class Delete_a_Node {
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
    public Node buildTree(Node root,int val){
        if(root==null){
            Node newNode =new Node(val);
            root=newNode;
            return root;
        }
        if(val<root.value){
            root.left= buildTree(root.left,val);
        }
        else{
            root.right=buildTree(root.right,val);
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

    public Node delete(Node root,int val){
        if(root==null){
            return null;
        }
        if(val<root.value){
            root.left=delete(root.left,val);
        }
        else if(val>root.value){
            root.right=delete(root.right,val);
        }
        else if(val==root.value){
            //case1: leaf node;
            if(root.left==null && root.right==null){
                return null;
            }
            // case 2: Only 1 child
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }

            // case3: Two children
            Node IS=findInorderSuccessor(root.right);
            root.value=IS.value;
            root.right=delete(root.right,IS.value);
        }
        return root;
    }

    public Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int [] values={8,5,3,1,4,6,10,11,14};
        Node root=null;
        Delete_a_Node obj=new Delete_a_Node();
        for(int i=0;i<values.length;i++){
            root=obj.buildTree(root,values[i]);
        }
        System.out.print("Original BST:");
        obj.inOrder(root);
        System.out.println();
        System.out.print("BST after deleting a node:");
        root=obj.delete(root,5);
        obj.inOrder(root);
    }

}

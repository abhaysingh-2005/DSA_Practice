package codewithBinarySearchTree;

public class Search_BST {
    public static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left= null;
            this.right=null;
        }
    }
    public Node insert(Node root,int val) {
        if (root == null) {
            Node newNode = new Node(val);
            root = newNode;
            return root;
        }
        if (val < root.value) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public boolean Search(Node root,int key) {
        if(root==null){
            return false;
        }
        if(root.value==key){
            return true;
        }
        if(key<root.value){
            boolean found=Search(root.left,key);
            return found;
        }
        else{
           boolean found=Search(root.right,key);
           return found;
        }
    }
    public static void main(String[] args) {
        int [] values={8,5,3,6,1,4,10,11,14};
        Node root=null;
        Search_BST obj=new Search_BST();
        for(int i=0;i<values.length;i++){
            root=obj.insert(root,values[i]);
        }
        obj.inOrder(root);
        System.out.println();
        int key=1;
        boolean result=obj.Search(root,key);
        if(result){      // Agar mil gye
            System.out.println("found");
        }else{                        // Agr nhi mila
            System.out.println("Not found");
        }
    }
}

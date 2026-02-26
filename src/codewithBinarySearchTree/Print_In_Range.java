package codewithBinarySearchTree;

public class Print_In_Range {
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
            Node newNode = new Node(val);
            root=newNode;
            return root;
        }
        if(val<root.value){
            root.left=insert(root.left,val);
        }
        else {
            root.right=insert(root.right,val);
        }
        return root;
    }
    public void preOrder(Node root){
        if(root==null){
            return ;
        }
        preOrder(root.left);
        System.out.print(root.value+" ");
        preOrder(root.right);
    }

    public void Print_between(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(k1<=root.value && root.value<=k2){
            Print_between(root.left,k1,k2);
            System.out.print(root.value+" ");
            Print_between(root.right,k1,k2);
        }
        else if(k2<root.value){   // left mea search kro
            Print_between(root.left,k1,k2);
        }else if(k1>root.value){  // right mea search kro
            Print_between(root.right,k1,k2);
        }
    }
    public static void main(String[] args) {
        Node root=null;
        int [] values={8,5,3,1,4,6,10,11,14};
        Print_In_Range obj=new Print_In_Range();
        for(int i=0;i<values.length;i++){
            root=obj.insert(root,values[i]);
        }
        obj.preOrder(root);
        System.out.println();
        int k1=5;
        int k2=12;
        obj.Print_between(root,k1,k2);
    }
}

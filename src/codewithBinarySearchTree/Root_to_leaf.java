package codewithBinarySearchTree;

import java.util.ArrayList;

public class Root_to_leaf {
    public class Node{
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
        if(val<root.value){
            root.left=insert(root.left,val);
        }
        else{
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

    public void Search_Path(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }

        path.add(root.value);
        if(root.left ==null && root.right==null){
            print_Path(path);
        }
        Search_Path(root.left,path);
        Search_Path(root.right,path);
        path.remove(path.size()-1);
    }

    public void print_Path(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root=null;
        int []values={8,5,3,6,10,11,14};
        Root_to_leaf obj=new Root_to_leaf();
        for(int i=0;i<values.length;i++){
            root=obj.insert(root,values[i]);
        }
        obj.inOrder(root);
        System.out.println();
        ArrayList<Integer> path=new ArrayList<>();
        obj.Search_Path(root,path);

    }
}

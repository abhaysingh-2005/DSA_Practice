package codewithTree;

import java.util.ArrayList;

public class Lowest_common_ancestor {
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
    public boolean Lowest_ancestor(Node root, int n,ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.value==n){
            return true;
        }
        boolean foundleft=Lowest_ancestor(root.left,n, path);
        boolean foundright=Lowest_ancestor(root.right,n, path);
        if(foundleft || foundright){
            return true;
        }
        else {
            path.remove(path.size() - 1);
            return false;
        }
//        return false;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        ArrayList<Node > path1=new ArrayList<>();
        ArrayList<Node> path2= new ArrayList<>();
        Lowest_common_ancestor obj=new Lowest_common_ancestor();
        int n1=4;
        int n2=5;
        obj.Lowest_ancestor(root,n1,path1);
        obj.Lowest_ancestor(root,n2,path2);
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!= path2.get(i)){
                break;
            }
        }
        if(i>0) {  // Agar koi common nhi hua toh nhi chalega
            System.out.println("LCA:=" + path1.get(i - 1).value);
        }
          else{
                  System.out.println("LCA not found");
          }
    }
}




//package codewithTree;
//
//import java.util.ArrayList;
//
//public class Lowest_common_ancestor {
//    public static class Node{
//        int value;
//        Node left;
//        Node right;
//
//        Node(int value){
//            this.value=value;
//            this.left=null;
//            this.right=null;
//        }
//    }
//    public Node path(Node root, int n1, int n2){
//        ArrayList<Node> path1= new ArrayList<>();
//        ArrayList<Node> path2 =  new ArrayList<>();
//        Lowest_ancestor(root, n1, path1);
//        Lowest_ancestor(root, n2, path2);
//        int i=0;
//        for(;i<path1.size() && i<path2.size();i++){
//            if(path1.get(i)!= path2.get(i)){
//                break;
//            }
//        }
//        if(i>0) {
//            return path1.get(i - 1);  // Node return hoga..
//        }
//        else{
//            return null;
//        }
//    }
//    public boolean Lowest_ancestor(Node root, int n,ArrayList<Node> path){
//        if(root==null){
//            return false;
//        }
//        path.add(root);
//        if(root.value==n){
//            return true;
//        }
//        boolean foundleft=Lowest_ancestor(root.left,n, path);
//        boolean foundright=Lowest_ancestor(root.right,n, path);
//        if(foundleft || foundright){
//            return true;
//        }
//        else {
//            path.remove(path.size() - 1);
//            return false;
//        }
//
//    }
//    public static void main(String[] args) {
//        Node root=new Node(1);
//        root.left=new Node(2);
//        root.right=new Node(3);
//        root.left.left=new Node(4);
//        root.left.right=new Node(5);
//        root.right.right=new Node(6);
//        Lowest_common_ancestor obj = new Lowest_common_ancestor();
//        int n1=4;
//        int n2=6;
//        Node ans= obj.path(root,n1,n2);
//        if(ans!=null){
//            System.out.println(ans.value);
//        }else{
//            System.out.println("Lowest common ancestor not found ");
//        }
//    }
//}

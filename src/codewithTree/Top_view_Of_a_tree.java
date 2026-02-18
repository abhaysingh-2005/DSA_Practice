package codewithTree;

import java.util.*;

public class Top_view_Of_a_tree {
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

    public static class Pair {
        Node node;
        int hd; //horizontal distance
        Pair(Node node,int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public void Top_view(Node root){
        // Level order
        Queue<Pair> q= new LinkedList<>();
        HashMap<Integer,Node> map =new HashMap<>();
        int min=0;
        int max=0;
        q.add(new Pair(root,0));
        q.add(null);


        while(!q.isEmpty()){
            Pair curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Pair(curr.node.left , curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }
                if(curr.node.right!= null){
                    q.add(new Pair(curr.node.right, curr.hd+1));
                    max= Math.max(max,curr.hd+1);
                }
            }
        }

        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).value + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        Top_view_Of_a_tree obj =new Top_view_Of_a_tree();
        obj.Top_view(root);

    }
}





// 2nd way...

//package codewithTree;
//
//import java.util.*;
//
//public class Top_view_Of_a_tree {
//    public static class Node {
//        int value;
//        Node left;
//        Node right;
//
//        Node(int value) {
//            this.value = value;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    public static class Pair {
//        Node node;
//        int hd; //horizontal distance
//        Pair(Node node,int hd) {
//            this.node = node;
//            this.hd = hd;
//        }
//    }
//
//    public void Top_view(Node root){
//        // Level order
//        Queue<Pair> q= new LinkedList<>();
//        HashMap<Integer,Integer> map =new HashMap<>();
//        int min=0;
//        int max=0;
//        q.add(new Pair(root,0));
//        q.add(null);
//
//
//        while(!q.isEmpty()){
//            Pair curr = q.remove();
//            if(curr==null){
//                if(q.isEmpty()){
//                    break;
//                }
//                else{
//                    q.add(null);
//                }
//            }
//            else{
//                if(!map.containsKey(curr.hd)){
//                    map.put(curr.hd, curr.node.value);
//                }
//                if(curr.node.left != null){
//                    q.add(new Pair(curr.node.left , curr.hd-1));
//                    min = Math.min(min,curr.hd-1);
//                }
//                if(curr.node.right!= null){
//                    q.add(new Pair(curr.node.right, curr.hd+1));
//                    max= Math.max(max,curr.hd+1);
//                }
//            }
//        }
//
//        for(int i=min;i<=max;i++){
//            System.out.print(map.get(i) + " ");
//        }
//        System.out.println();
//
//    }
//    public static void main(String[] args) {
//        Node root=new Node(1);
//        root.left=new Node(2);
//        root.right=new Node(3);
//        root.left.left=new Node(4);
//        root.left.right=new Node(5);
//        root.right.left=new Node(6);
//        root.right.right=new Node(7);
//        Top_view_Of_a_tree obj =new Top_view_Of_a_tree();
//        obj.Top_view(root);
//
//    }
//}

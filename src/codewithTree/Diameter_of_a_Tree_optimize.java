package codewithTree;

public class Diameter_of_a_Tree_optimize {
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
    public static class Pair{
        int diameter;
        int height;
        Pair(int diameter,int height){
            this.diameter=diameter;
            this.height=height;
        }
    }
    public Pair finddiameter(Node root){
        if (root == null) {
            return  new Pair(0,0);
        }
        Pair left=finddiameter(root.left);     // yeh ek object hai
        Pair right=finddiameter(root.right);   // yeh dusra object hai
        int currentHeight=Math.max(left.height, right.height)+1;
        int currentDiameter= Math.max(left.height + right.height +1, Math.max(left.diameter , right.diameter));
        return new Pair(currentDiameter,currentHeight);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node (4);
        root.left.right=new Node (5);
        root.right.left=new Node(6);
        root.right.right=new Node (7);
        Diameter_of_a_Tree_optimize obj_optimize=new Diameter_of_a_Tree_optimize();
        Pair ans=obj_optimize.finddiameter(root);
        System.out.println("Diameter ="+ans.diameter);   // diameter(root) yeh object hai iska diam print krane hai...
    }
}

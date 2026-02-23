package codewithBinaryTree;

public class Min_distance_between_nodes {
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
    public Node findLCA(Node root, int n1, int n2){
        if(root==null){
            return null;
        }
        if(root.value==n1 || root.value==n2){
            return root;
        }
        Node foundleft=findLCA(root.left, n1, n2);
        Node foundright=findLCA(root.right, n1, n2);
        if(foundleft==null){
            return foundright;
        }
        if(foundright==null){
            return foundleft;
        }
        return root;
    }

    public int minDistance(Node root, int n){

        if(root==null){
            return -1;
        }
        if(root.value==n){
            return 0;
        }
        int left_distance=minDistance(root.left,n);
        int right_distance=minDistance(root.right,n);
        if(left_distance==-1 && right_distance==-1){
            return -1;
        }
        return Math.max(left_distance,right_distance)+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        Min_distance_between_nodes obj= new Min_distance_between_nodes();
        int n1=4;
        int n2=6;
        Node ans=obj.findLCA(root,n1,n2);
        System.out.println(ans.value);
        int a=obj.minDistance(ans,n1);
        int b=obj.minDistance(ans,n2);
        int total_distance= a+b;
        System.out.println(total_distance);

    }
}

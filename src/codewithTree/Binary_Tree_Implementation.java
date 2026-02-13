package codewithTree;

public class Binary_Tree_Implementation {
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

    public static class binarytree{
        int i=-1;
        public Node buildTree(int[] nodes){
            i++;
            if(nodes[i]==-1){
                return null;
            }
            Node root=new Node(nodes[i]);
            root.left=buildTree(nodes);
            root.right=buildTree(nodes);
            return root; // jaha call hua tha vaha bhej do...
        }

        public void preOrder(Node root) {     //O(n)
            if (root == null) {
                return;
            } else {
                System.out.print(root.value + " ");
                preOrder(root.left);
                preOrder(root.right);
            }
        }



        public void inOrder(Node root) {   //O(n)
            if (root == null) {
                return;
            } else {
                inOrder(root.left);
                System.out.print(root.value + " ");
                inOrder(root.right);
            }
        }




        public void postOrder(Node root) {     //O(n)
            if (root == null) {
                return;
            } else {
                postOrder(root.left);
                postOrder(root.right);
                System.out.print(root.value + " ");
            }
        }
    }

    public static void main(String[] args) {
        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree bt=new binarytree();
        Node root=bt.buildTree(nodes);
        System.out.println(root.value);

        System.out.print("Preorder: ");
        bt.preOrder(root);

        System.out.print("\nInorder: ");
        bt.inOrder(root);

        System.out.print("\nPostorder:");
        bt.postOrder(root);


    }
}

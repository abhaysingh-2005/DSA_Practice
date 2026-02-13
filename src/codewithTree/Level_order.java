package codewithTree;

import java.util.*;

public class Level_order {
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
        public static class buildTree{
            int i=-1;
            public Node buildtree(int[] nodes){
                i++;
                if(nodes[i]==-1){
                    return null;
                }
                Node root=new Node(nodes[i]);
                root.left=buildtree(nodes);
                root.right=buildtree(nodes);
                return root;
            }

            public void levelOrder(Node root){    //....O(n)
                if(root==null){
                    return;
                }
                Queue<Node> q=new LinkedList<>();
                q.add(root);
                q.add(null);

                while(!q.isEmpty()){
                    Node currNode=q.remove();
                    if(currNode==null){
                        System.out.println();
                        if(q.isEmpty()){
                            break;
                        }
                        else {
                            q.add(null);
                        }
                    }
                    else{
                        System.out.print(currNode.value+" ");
                        if(currNode.left!=null){
                            q.add(currNode.left);
                        }
                        if(currNode.right!=null) {
                            q.add(currNode.right);
                        }
                    }
                }

            }

    }
    public static void main(String[] args) {
        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        System.out.println("Levelorder: ");
        buildTree bt=new buildTree();
        Node root=bt.buildtree(nodes);
        bt.levelOrder(root);

    }
}

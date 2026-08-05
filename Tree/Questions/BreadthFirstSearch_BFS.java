package Tree.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch_BFS {

    // ---------- Naive Approach ------- T.C = ( O(n) + O(n*h) )  , S.C=O(h)
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void printNode(int k,Node root){
        if(root == null){
            return;
        }
        if(k == 0){
            System.out.print(root.data +" ");
            return ;
        }

        printNode(k-1,root.left);
        printNode(k-1,root.right);
    }

    // ---------- Efficient Approach ------ T.C = O(n), S.C = O(width of BT)
    public static void bfsTraversal(Node root, Queue<Node> q){
        if(root == null){
            return;
        }
        q.add(root);
        while ( !q.isEmpty()){
            Node temp = q.remove();
            System.out.print(temp.data +" ");
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
    }


    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(20);
        root.right = new Node(40);
        root.left.left = new Node(60);
        root.left.right = new Node(18);
        root.right.left = new Node(50);
        root.right.right = new Node(90);
        root.left.left.left = new Node(75);
        root.left.right.left = new Node(80);

        int h = height(root);
        for(int i=0;i<h;i++){
            printNode(i,root);
        }

        Queue<Node> q = new LinkedList<>();
        bfsTraversal(root,q);
    }
}

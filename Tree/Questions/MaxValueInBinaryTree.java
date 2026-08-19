package Tree.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class MaxValueInBinaryTree {

    // Naive Approach--------- T.C=O(n)  , S.C = O(h)
    public static int maxNode(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        return Math.max(Math.max(maxNode(root.left),maxNode(root.right)),root.data);

    }

    // ---------- Efficient Approach --------- T.C = O(n) , S.C = O(width of BT)
    public static int findMaxNode(Node root, Queue<Node> q){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int max = 0;
        q.add(root);
        max = root.data;

        while ( !q.isEmpty()){
            Node temp = q.remove();
            if(temp.left != null){
                max = Math.max(max,temp.left.data);
                q.add(temp.left);
            }
            if(temp.right != null){
                max = Math.max(max,temp.right.data);
                q.add(temp.right);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(20);
        root.right = new Node(40);
        root.left.left = new Node(60);
        root.left.right = new Node(18);
        root.right.left=new Node(50);
        root.right.right = new Node(90);

//        System.out.println("Maximum element : "+maxNode(root));   // 90

        Queue<Node> q = new LinkedList<>();
        System.out.println("Maximum element : "+findMaxNode(root,q));
    }
}

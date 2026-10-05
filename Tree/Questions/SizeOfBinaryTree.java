package Tree.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBinaryTree {   // size -> No of nodes in the tree.

    // ----------- Naive Approach  --------- T.C = O(n) , S.C = O(h)
    public static int size(Node root){
        if(root == null) {
            return 0;
        }

        return size(root.left) + size(root.right)+1;
    }

    // ------------ Efficient Approach ------- T.C = O(n) , S.C = O(width of BT)
    public static int countSize(Node root, Queue<Node> q,int count){
        if(root == null){
            return 0;
        }
        q.add(root);
        count++;
        while ( !q.isEmpty()){
            Node temp = q.remove();
            if(temp.left != null){
                count++;
                q.add(temp.left);
            }
            if(temp.right != null){
                count++;
                q.add(temp.right);
            }
        }

        return count;
    }

    // ------ Optimal approach ------------  size of Complete binary tree
    public static int countNodes(Node root) {
        // code here
        if(root == null){
            return 0;
        }

        int lh = 0;
        int rh = 0;
        Node curr = root;
        while (curr != null) {
            lh++;
            curr = curr.left;
        }

        curr = root;
        while (curr != null) {
            rh++;
            curr = curr.right;
        }

        if(lh == rh){
            return (int)(Math.pow(2,lh)-1);
        }

        return 1+countNodes(root.left)+countNodes(root.right);
    }


    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(20);
        root.right = new Node(40);
        root.left.left = new Node(60);
        root.left.right = new Node(18);
        root.right.left=new Node(50);
        root.right.right = new Node(90);


        System.out.println(size(root));  // 7

        Queue<Node> q = new LinkedList<>();
        System.out.println(countSize(root,q,0));   // 7

        System.out.println("Size of complete binary tree : "+countNodes(root));   // 7
    }
}

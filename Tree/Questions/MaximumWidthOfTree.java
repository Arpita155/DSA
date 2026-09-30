package Tree.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfTree {

    // ---------- Brute Force Approach ----------
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static int maxwidth(int k,Node root){
        if(root == null){
            return 0;
        }
        if(k == 0){
            return 1;
        }

        return maxwidth(k-1,root.left) + maxwidth(k-1,root.right);
    }

    // ------ Efficient Approach  --------  T.C = O(n), S.C = O(w)  w= max width .
//    public static int maxWidth(Node root) {
//
//        if(root == null){
//            return 0;
//        }
//
//        int res = 0;
//
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);

//        while(!q.isEmpty()){
//            int size = q.size();
//            res = Math.max(res,size);
//
//            for(int i=0;i<size;i++){
//                Node temp = q.remove();
//
//                if(temp.left != null){
//                    q.add(temp.left);
//                }
//
//                if(temp.right != null){
//                    q.add(temp.right);
//                }
//            }
//        }
//
//        return res;
//    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int h = height(root);
        int res = 0;
        for(int i=0;i<h;i++){
            res = Math.max(res,maxwidth(i,root));
        }
        System.out.println("Maximum width of the binary tree is : "+res);

//        System.out.println("Maximum width of the binary tree is : "+maxWidth(root));


    }
}

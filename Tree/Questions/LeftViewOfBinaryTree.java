package Tree.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {

    // ------ Naive Approach ---- T.C = O(n) , S.C = O(h)
    static int maxLevel = 0;
    public static void leftSideView(Node root, int lvisit) {
        if(root == null){
            return ;
        }

        if(maxLevel < lvisit){
            System.out.print(root.data+" ");
            maxLevel = lvisit;
        }

        leftSideView(root.left,lvisit+1);
        leftSideView(root.right,lvisit+1);

    }

    //------ Efficient Approach  -------- T.C = O(n), S.C = O(w)
    public static ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                if (i == 0) {
                    result.add(curr.data);
                }
                if (curr.left != null)
                    queue.offer(curr.left);
                if (curr.right != null)
                    queue.offer(curr.right);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(20);
        root.right = new Node(40);
        root.left.left = new Node(60);
        root.left.right = new Node(18);
        root.right.left=new Node(50);

//        leftSideView(root,1);   // 30 20 60
        System.out.println(leftView(root));   // [30,20,60]
    }
}

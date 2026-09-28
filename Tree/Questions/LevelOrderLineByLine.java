package Tree.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderLineByLine {

    // Naive Approach ------- T.C = O(n) S.C=O(w), where w = width of the Binary tree
    public static ArrayList<ArrayList<Integer>> levelByLevel(Node root){

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (q.size() > 1){
            Node temp = q.poll();

            if(temp == null){
                res.add(al);
                al = new ArrayList<>();
                q.add(null);
                continue;
            }else{
                al.add(temp.data);
            }

            if(temp.left !=null){
                q.add(temp.left);
            }
            if(temp.right !=null){
                q.add(temp.right);
            }
        }

        res.add(al);
        return res;
    }

    // Efficient Approach
    public static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);


        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> al = new ArrayList<>();

            for(int i=0;i<size;i++){
                Node temp = q.remove();
                al.add(temp.data);

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }

            res.add(al);
        }

        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(40);
        root.right = new Node(30);
        root.left.left = new Node(20);
        root.right.left = new Node(10);
        root.right.right = new Node(70);
        root.right.left.left = new Node(60);
        root.right.right.right = new Node(80);

//        System.out.println(levelOrder(root));
        System.out.println(levelByLevel(root));
    }
}

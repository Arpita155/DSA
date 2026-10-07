package Tree.Questions;

import java.util.*;

public class ZigZagTraversal {

    public static ArrayList<Integer> zigZagTraversal1(Node root) {
        // ----- Using Deque -----
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Deque<Node> q = new LinkedList<>();
        q.addFirst(root);
        boolean reverse = false;

        while (!q.isEmpty()) {
            int level = q.size();

            for (int i = 0; i < level; i++) {
                if (!reverse) {
                    Node curr = q.pollFirst();
                    res.add(curr.data);
                    if (curr.left != null) q.addLast(curr.left);
                    if (curr.right != null) q.addLast(curr.right);
                } else {
                    Node curr = q.pollLast();
                    res.add(curr.data);
                    if (curr.right != null) q.addFirst(curr.right);
                    if (curr.left != null) q.addFirst(curr.left);
                }
            }

            reverse = !reverse;
        }

        return res;
    }

    public static ArrayList<Integer> zigZagTraversal2(Node root) {
        // --------- Using Stack and Queue -------
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<Node> st = new Stack<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean reverse = false;

        while (!q.isEmpty()) {
            int count = q.size();

            for (int i = 0; i < count; i++) {
                Node temp = q.poll();

                if(!reverse){
                    res.add(temp.data);
                }
                if(reverse){
                    st.add(temp);
                }
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            if(reverse){
                while(!st.isEmpty()){
                    res.add(st.pop().data);
                }
            }

            reverse = !reverse;
        }

        return res;
    }

    public static ArrayList<Integer> zigZagTraversal(Node root) {
        // ---------- Using two stacks ------------
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);

        while(!st1.isEmpty() || !st2.isEmpty()){

            while(!st1.isEmpty()){
                Node temp = st1.pop();
                res.add(temp.data);
                if(temp.left != null){
                    st2.push(temp.left);
                }
                if(temp.right != null){
                    st2.push(temp.right);
                }
            }

            while(!st2.isEmpty()){
                Node temp = st2.pop();
                res.add(temp.data);
                if(temp.right != null){
                    st1.push(temp.right);
                }
                if(temp.left != null){
                    st1.push(temp.left);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);

        System.out.print("Using Deque : ");
        System.out.println(zigZagTraversal1(root));  // [1, 3, 2, 4, 5, 6]

        System.out.print("Using stack and Queue : ");
        System.out.println(zigZagTraversal2(root));  // [1, 3, 2, 4, 5, 6]

        System.out.print("Using two stacks : ");
        System.out.println(zigZagTraversal(root));   // [1, 3, 2, 4, 5, 6]
    }
}

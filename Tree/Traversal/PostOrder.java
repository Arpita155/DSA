package Tree.Traversal;

import java.util.Stack;

public class PostOrder {

    // ------ Recursive Approach ------
    /*public static void postOrder(Node root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }*/

    // ------- Iterative Approach ------
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        Node curr = root;
        Node lastVisited = null;
        Stack<Node> st = new Stack<>();

        while (!st.isEmpty() || curr != null) {
            // Move to the leftmost node
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            // Peek the top element of the stack
            Node temp = st.peek();

            // If the right child exists and hasn't been visited yet, move right
            if (temp.right != null && temp.right != lastVisited) {
                curr = temp.right;
            } else {
                // Otherwise, process/print the node and pop it
                System.out.print(temp.data + " ");
                lastVisited = st.pop();
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(77);
        root.left = new Node(99);
        root.right = new Node(45);
        root.left.right = new Node(50);
        root.right.left=new Node(38);
        root.right.left.right = new Node(99);

        System.out.print("postOrder traversal : ");  //ans : 50 99 99 38 45 77
        postorder(root);
    }
}

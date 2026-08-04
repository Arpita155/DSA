package Tree.Traversal;

import java.util.Stack;

public class PreOrder {

    // ------------- Recursive Approach ------------
    /*public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }*/

    // ---------- Iterative Approach ------------
    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        Node curr = root;
        Stack<Node> st = new Stack<>();
        while (!st.isEmpty() || curr!=null){
            while (curr!=null){
                System.out.print(curr.data+" ");
                st.push(curr);
                curr = curr.left;
            }

            Node temp = st.pop();
            curr = temp.right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(77);
        root.left = new Node(99);
        root.right = new Node(45);
        root.left.right = new Node(50);
        root.right.left=new Node(38);
        root.right.left.right = new Node(99);

        System.out.print("PreOrder traversal : ");  // ans : 77 99 50 45 38 99
        preOrder(root);
    }
}

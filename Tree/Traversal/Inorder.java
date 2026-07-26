package Tree.Traversal;

import java.util.Stack;

public class Inorder {

    // ------- Using Recursive Approach ------- T.C = O(n) , S.C = O(h)
    /* public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }*/

    // ---------- Using Iterative Approach -----------  T.C = O(n) , S.C = O(h)
    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        Node curr = root;
        Stack<Node> st = new Stack<>();
        while (!st.isEmpty() || curr!=null){
            while (curr!=null){
                st.push(curr);
                curr = curr.left;
            }

            Node temp = st.pop();
            System.out.print(temp.data+" ");
            curr = temp.right;
        }
    }


    public static void main(String[] args) {
        // Ex1
//        Node root = new Node(77);
//        root.left = new Node(99);
//        root.right = new Node(45);
//        root.left.right = new Node(50);
//        root.right.left=new Node(38);
//        root.right.left.right = new Node(99);

        // Ex2
        Node root = new Node(80);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(40);
        root.left.right = new Node(90);
        root.right.left=new Node(70);
        root.right.right = new Node(20);
        root.left.left.left = new Node(11);
        root.right.left.right = new Node(22);

        System.out.print("inOrder traversal : ");   // 99 50 77 38 99 45
        inOrder(root);
    }
}

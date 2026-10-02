package Tree.Questions;

import java.util.ArrayList;
import java.util.Collections;

public class MorrisTraversal {

    public static ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();

        Node curr = root;
        while(curr != null){
            if(curr.left == null){
                res.add(curr.data);
                curr = curr.right;
            }else{
                Node prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = curr;
                    curr = curr.left;
                }else{
                    prev.right = null;
                    res.add(curr.data);
                    curr = curr.right;

                }
            }
        }

        return res;
    }

    public static ArrayList<Integer> preOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();

        Node curr = root;

        while(curr != null){
            if(curr.left == null){
                res.add(curr.data);
                curr = curr.right;
            }else{
                Node prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right == null){
                    res.add(curr.data);
                    prev.right = curr;
                    curr = curr.left;
                }else{
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }

        return res;
    }

    public static ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();

        Node curr = root;

        while(curr != null){
            if(curr.right == null){
                res.add(curr.data);
                curr = curr.left;
            }else{
                Node prev = curr.right;
                while(prev.left != null && prev.left != curr){
                    prev = prev.left;
                }
                if(prev.left == null){
                    res.add(curr.data);
                    prev.left = curr;
                    curr = curr.right;
                }else{
                    prev.left = null;
                    curr = curr.left;
                }
            }
        }

        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Inorder traversal : ");
        System.out.println(inOrder(root));    // Inorder traversal : [4, 2, 5, 1, 3]

        System.out.print("Preorder traversal : ");
        System.out.println(preOrder(root));   // Preorder traversal : [1, 2, 4, 5, 3]

        System.out.print("Postorder traversal :");
        System.out.println(postOrder(root));   // Postorder traversal :[4, 5, 2, 3, 1]
    }
}

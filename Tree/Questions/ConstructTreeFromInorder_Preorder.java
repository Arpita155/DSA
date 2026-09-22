package Tree.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructTreeFromInorder_Preorder {

    // Keep track of the current root index in the preorder array
    private static int preIndex = 0;

    public static Node buildTree(int []inorder, int []preorder) {
        preIndex = 0; // Reset for multiple test cases
        return createTree(inorder, preorder, 0, inorder.length - 1);
    }

    public static Node createTree(int[] inorder, int[] preorder, int st, int end) {
        // Base case
        if (st > end) {
            return null;
        }
        // Pick current node from Preorder traversal using preIndex and increment preIndex
        Node root = new Node(preorder[preIndex++]);

        // If this node has no children, return it
        if (st == end) {
            return root;
        }
        // Find the index of this node in Inorder traversal
        int j = st;
        for (int id = st; id <= end; id++) { // Fixed boundary condition to id <= end
            if (inorder[id] == root.data) {
                j = id;
                break; // Break early once found to save time
            }
        }

        // Using index in Inorder traversal, construct left and right subtrees
        root.left = createTree(inorder, preorder, st, j - 1);
        root.right = createTree(inorder, preorder, j + 1, end);

        return root;
    }

    public static void printTree(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] inorder = {3, 1, 4, 0, 5, 2};
        int[] preorder = {0, 1, 3, 4, 2, 5};

        Node root = buildTree(inorder,preorder);

        System.out.print("The tree looks like this : ");
        printTree(root);    // Output : -->  The tree looks like this : 0 1 2 3 4 5
    }
}

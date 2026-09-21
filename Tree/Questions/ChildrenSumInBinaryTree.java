package Tree.Questions;

public class ChildrenSumInBinaryTree {

    public static boolean isSumProperty(Node root) {
        // -------- Recursive approach -------- T.C = O(n) , S.C = O(h) h = height of the BT.
        if (root == null) {
            return true;
        }

        // Base case
        if (root.left == null && root.right == null) {
            return true;
        }

        int sum = 0;

        if (root.left != null) {
            sum += root.left.data;
        }
        if (root.right != null) {
            sum += root.right.data;
        }

        if (root.data == sum) {
            return isSumProperty(root.left) && isSumProperty(root.right);
        }

        return false;
    }


    public static void main(String[] args) {
        Node root = new Node(35);
        root.left = new Node(20);
        root.right = new Node(15);
        root.left.left = new Node(15);
        root.left.right = new Node(5);
        root.right.left=new Node(10);
        root.right.right = new Node(5);

        System.out.println("Is the children sum of the binary tree equals to it's root : "+isSumProperty(root));
    }
}

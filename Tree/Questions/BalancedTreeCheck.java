package Tree.Questions;

public class BalancedTreeCheck {

    // ------ Brute Force Approach ---------   T.C = O(n^2) , S.C = O(h)  h = height of BT.
    /*public static boolean isBalanced(Node root) {
        // code here
        if(root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight-rightHeight) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        return Math.max(height(root.left),height(root.right))+1;
    }*/

    // ------- Efficient Approach -------
    public static boolean isBalanced(Node root) {
        // code here
        return height(root) != -1;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        if(left == -1){
            return -1;
        }

        int right = height(root.right);
        if(right == -1){
            return -1;
        }

        if(Math.abs(left-right) > 1){
            return -1;
        }

        return Math.max(left,right)+1;
    }



    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
//        root.left.right.left = new Node(6);

        System.out.println("Is it a balanced tree : "+isBalanced(root));   // true
    }
}

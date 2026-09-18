package Tree.Questions;

public class DiameterOfBinaryTree {

    // -------Brute Force approach --------  T.C = O(n^2) , S.C = O(1)
    /* public static int diameter(Node root) {
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return Math.max(leftHeight+rightHeight,Math.max(leftDiameter,rightDiameter));
    }
    public static int height(Node root){   // T.C= O(n) S.C = O(h)
        if(root == null){
            return 0;
        }

        return Math.max(height(root.left),height(root.right))+1;
    } */


    // ------------- Efficient Approach ----------- T.C = O(n) , S.C = O(1)
    static int res = 0;
    public static int diameter(Node root) {
        if(root == null){
            return 0;
        }
        height(root);

        return res;
    }

    public static int height(Node root){   // T.C= O(n) S.C = O(h)
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        res = Math.max(res,lh+rh);

        return Math.max(lh,rh)+1;
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(20);
        root.right = new Node(40);
        root.left.left = new Node(60);
        root.left.right = new Node(18);
        root.right.left=new Node(50);
        root.right.right = new Node(90);
        root.left.left.left = new Node(75);

        System.out.println("Diameter of the tree is : "+diameter(root));   // OUTPUT : 5
    }
}

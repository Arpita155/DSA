package Tree.Questions;

public class HeightOfTree {

    public static int height(Node root){   // T.C= O(n) S.C = O(h)
        if(root == null){
            return 0;
        }

        return Math.max(height(root.left),height(root.right))+1;
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

        System.out.println("Height of the tree is : "+height(root));  // 4
    }
}

package Tree.Questions;

public class PrintNodesKDistanceFromRoot {

    public static void printNode(Node root,int k){    // T.C= O(n) S.C = O(h)
        if(root == null){
            return;
        }
        if (k == 0){
            System.out.print(root.data+" ");
            return;
        }

        printNode(root.left,k-1);
        printNode(root.right,k-1);
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(20);
        root.right = new Node(40);
        root.left.left = new Node(60);
        root.left.right = new Node(18);
        root.right.left=new Node(50);
        root.right.right = new Node(90);

        printNode(root,2);
    }
}

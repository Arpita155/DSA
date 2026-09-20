package Tree.Questions;

public class BinaryTreeToDDL {

    static Node prev = null;
    static Node head = null;

    public static Node treeToDLL(Node root) {
        // code here
        if(root == null){
            return null;
        }

        treeToDLL(root.left);

        if(prev == null){
            head = root;
        }
        else{
            root.left=prev;
            prev.right = root;
        }
        prev = root;
        treeToDLL(root.right);

        return head;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }
}

package Tree.Traversal;

public class InPrePostTraversal {

    static void inOrder(Node root){
        if(root == null){
            return;
        }else{
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    static void preOrder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static void postOrder(Node root){
        if(root == null){
            return;
        }else{
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(77);
        root.left = new Node(99);
        root.right = new Node(45);
        root.left.right = new Node(50);
        root.right.left=new Node(38);
        root.right.left.right = new Node(99);

        System.out.print("inOrder traversal : ");
        inOrder(root);

        System.out.print("\nPreOrder traversal : ");
        preOrder(root);

        System.out.print("\npostOrder traversal : ");
        postOrder(root);
    }
}

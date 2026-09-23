package Tree.Questions;

import java.util.ArrayList;

public class LCAofBt {

    // -------Brute force -------     T.C = O(n) , S.C= O(n)
    /*public static Node lca(Node root, int n1, int n2) {
        // code here
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();

        boolean r1 = findlca(p1,n1,root);
        boolean r2 = findlca(p2,n2,root);

        if(r1==false || r2==false){
            return null;
        }

        int i = 0;
        while(i < p1.size() && i < p2.size()){
            if(p1.get(i) != p2.get(i)){
                break;
            }
            i++;
        }

        return p1.get(i-1);
    }
    public static boolean findlca(ArrayList<Node> p, int n, Node root){
        if(root == null){
            return false;
        }
        p.add(root);
        if(root.data == n){
            return true;
        }
        if(findlca(p,n,root.left) || findlca(p,n,root.right)){
            return true;
        }
        p.remove(p.size()-1);

        return false;
    }*/

    // ------- Efficient Approach -------   T.C = O(n) , S.C =  O(1)
    public static Node lca(Node root, int n1, int n2) {
        // code here
        if(root == null || n1==root.data || n2==root.data){
            return root;
        }

        Node leftlca = lca(root.left,n1,n2);
        Node rightlca = lca(root.right,n1,n2);

        if(leftlca != null && rightlca != null){
            return root;
        }

        return leftlca != null ? leftlca : rightlca;
    }

    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left=new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(8);

        Node res  = lca(root,7,8);     // output : 3
        if(res == null){
            System.out.println(0);
        }else{
            System.out.println(res.data);
        }

    }
}

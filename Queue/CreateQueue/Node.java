package Queue.CreateQueue;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next=null;
    }

    public static void traversal(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        traversal(head.next);
    }
}

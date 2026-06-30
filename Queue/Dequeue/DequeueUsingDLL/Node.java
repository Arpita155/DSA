package Queue.dequeue.DequeueUsingDLL;

public class Node {

    int data;
    Node next;
    Node prev;

    Node(int value){
        this.data=value;
        this.next=null;
        this.prev=null;
    }

    public static void traversal(Node head){
        if(head==null){
            System.out.println("Empty DLL ");
            return;
        }
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}

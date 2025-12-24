package LinkedList.DoublyLinkedList;

public class InsertAtEndOfDLL {

    public static Node insertAtEnd(Node head, int v){
        Node temp = new Node(v);
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.print("Before insertion Your DLL looks like this : ");
        Node.traversal(head);

        head = insertAtEnd(head,50);

        System.out.print("\nAfter insertion Your DLL looks like this : ");
        Node.traversal(head);
    }
}

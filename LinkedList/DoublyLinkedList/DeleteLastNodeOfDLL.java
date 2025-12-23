package LinkedList.DoublyLinkedList;

public class DeleteLastNodeOfDLL {

    public static Node deleteLastNode(Node head){
        Node curr = head;
        while (curr.next.next!=null){
            curr=curr.next;
        }
        curr.next.prev=null;
        curr.next=null;

        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.print("Before insertion Your DLL looks like this : ");
        Node.traversal(head);

        head = deleteLastNode(head);

        System.out.print("\nAfter insertion Your DLL looks like this : ");
        Node.traversal(head);
    }
}

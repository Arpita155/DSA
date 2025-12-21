package LinkedList.DoublyLinkedList;

public class CreateDLL {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.print("Your DLL looks like this : ");
        Node.traversal(head);
    }
}

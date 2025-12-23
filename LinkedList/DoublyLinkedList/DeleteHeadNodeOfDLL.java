package LinkedList.DoublyLinkedList;

public class DeleteHeadNodeOfDLL {

    public static Node deleteHeadNode(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node curr = head.next;
        head.next.prev=null;
        head.next=null;
        return curr;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.print("Before deletion Your DLL looks like this : ");
        Node.traversal(head);

        head = deleteHeadNode(head);

        System.out.print("\nAfter deletion Your DLL looks like this : ");
        Node.traversal(head);
    }
}

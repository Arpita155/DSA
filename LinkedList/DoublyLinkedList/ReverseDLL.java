package LinkedList.DoublyLinkedList;

public class ReverseDLL {

    public static Node reverse(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node temp = null;
        Node curr = head;
        while(curr!=null)
        {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        return temp.prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.print("Original LL : ");
        Node.traversal(head);

        head = reverse(head);

        System.out.print("After reversing : ");
        Node.traversal(head);
    }
}

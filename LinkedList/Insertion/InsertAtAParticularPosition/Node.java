package LinkedList.Insertion.InsertAtAParticularPosition;

public class Node {

    int data;
    Node next;
    Node(int value){
        this.data = value;
        this.next = null;
    }
    public static Node insert(int v, int pos, Node head){
        Node curr = head;
        Node temp = new Node(v);
        for(int i=1;i<pos-1 && curr!=null;i++){
            curr = curr.next;
        }
        if(curr == null){
            return temp;
        }

        temp.next = curr.next;
        curr.next = temp;

        return temp;
    }

    static void traversal(Node head) {

        // --------Recursive Traversal------------
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        traversal(head.next);

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Before inserting the element,Linked list looks like this : ");
        traversal(head);        // Before inserting element.

        insert(15,4,head);

        System.out.print("\nAfter inserting the element,Linked list looks like this : ");
        traversal(head);
    }
}

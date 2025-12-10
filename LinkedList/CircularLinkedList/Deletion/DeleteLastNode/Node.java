package LinkedList.CircularLinkedList.Deletion.DeleteLastNode;

class Node {
    int data;
    Node next;

    Node(int value){
        this.data = value;
        this.next = null;
    }

    public static Node delete(Node head){
        if(head == null || head.next==head){
            head=null;
            return head;
        }
        Node curr = head;
        while (curr.next.next!=head){
            curr=curr.next;
        }
        curr.next=head;
        return head;
    }

    static void traversal(Node head) {
        if(head == null){
            System.out.println("Empty CLL");
            return;
        }
        Node curr = head.next;
        System.out.print(head.data+" ");
        while (curr!=head){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next=head;

        System.out.print("Before deletion the list looks like this : ");  // 5 10 20
        traversal(head);

        head=delete(head);
        System.out.print("\nAfter deletion the list looks like this : ");   // 5 10
        traversal(head);
    }
}

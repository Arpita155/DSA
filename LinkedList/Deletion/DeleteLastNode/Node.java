package LinkedList.Deletion.DeleteLastNode;

class Node {
    int data;
    Node next;

    Node(int value){
        this.data = value;
        this.next = null;
    }

    public static void delete(Node head){
        if(head == null){
            return;
        }
        Node curr = head;
        if(head.next == null){
            head=null;
            return;
        }
        while (curr.next.next != null){
            curr = curr.next;
        }
        curr.next=null;
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
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(20);

        System.out.print("Before deletion the list looks like this : ");
        traversal(head);

        delete(head);
//        System.out.println(head.data);   // 20
        System.out.print("\nAfter deletion the list looks like this : ");
        traversal(head);
    }
}

package LinkedList.Deletion.DeleteFirstNode;

class Node {

    int data;
    Node next;

    Node(int value){
        this.data = value;
        this.next = null;
    }

    public static Node delete(Node head){
        if(head == null){
            return head;
        }
        return head.next;
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

        System.out.print("Before deletion the list looks like this : ");   
        traversal(head);      // Before deletion the list looks like this : 10 20 

        head = delete(head);
//        System.out.println(head.data);   // 20
        System.out.print("\nAfter deletion the list looks like this : ");   
        traversal(head);       // After deletion the list looks like this : 20
    }
}

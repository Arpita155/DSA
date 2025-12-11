package LinkedList.Questions;

public class Node {
    int data;
    Node next;

    Node(int value){
        this.data=value;
        this.next=null;
    }

    static void traversal(Node head) {

        // -----------Iterative Traversal--------
        if (head == null) {
            System.out.println("list is empty.");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

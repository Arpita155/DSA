package LinkedList.Questions.LoopOrCycle;

public class Node {
    int data;
    Node next;
    boolean visited;

    Node(int value){
        this.data=value;
        this.next=null;
        visited = false;
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

package Stack.CreateStack.CreateStackUsingLinkedList;

public class Node {
    Node next;
    int data;

    Node(int value){
        this.next = null;
        this.data=value;
    }

    static void traversal(Node head) {

        // --------Recursive Traversal------------
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        traversal(head.next);

    }
}

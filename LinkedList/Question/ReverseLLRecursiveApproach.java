package LinkedList.Questions;

import java.util.ArrayList;

public class ReverseLLRecursiveApproach {

    static Node reverseRecursive(Node head){

        // T.C = O(n)   S.C = O(n)
        if(head == null  || head.next==null){
            return head;
        }

        Node revHead = reverseRecursive(head.next);
        Node revTail = head.next;
        revTail.next=head;
        head.next=null;

        return revHead;

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

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);

        System.out.print("Before Reversing LL looks like this : ");
        traversal(head);

        head = reverseRecursive(head);

        System.out.print("\nAfter Reversing LL looks like this : ");
        traversal(head);
    }
}

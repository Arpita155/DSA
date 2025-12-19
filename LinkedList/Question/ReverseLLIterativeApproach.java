package LinkedList.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseLLIterativeApproach {

    static Node reverse(Node head){

        //Approach-1 :  NaiveApproach          T.C = O(n) S.C = O(n)
        /*if(head == null || head.next==null){
            return head;
        }

        ArrayList<Integer> temp = new ArrayList<>();
        Node curr = head;
        while (curr != null){
            temp.add(curr.data);
            curr=curr.next;
        }
        curr=head;
        int i=temp.size();
        while (curr != null){
            curr.data = temp.get(i-1);
            curr = curr.next;
            i--;
        }

        return head;
        */

        // Approach -2    : Efficient Approach    T.C = O(n)   S.C = O(1)
        if(head == null || head.next==null){
            return head;
        }
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.print("Before Reversing LL looks like this : ");    // 10 20 30 40
        Node.traversal(head);

        head = reverse(head);

        System.out.print("\nAfter Reversing LL looks like this : ");   //  40 30 20 10
        Node.traversal(head);
    }
}

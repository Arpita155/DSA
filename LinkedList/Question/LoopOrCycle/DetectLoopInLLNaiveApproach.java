package LinkedList.Questions.LoopOrCycle;

import java.util.HashSet;

public class DetectLoopInLLNaiveApproach {


    public static boolean detectLoop(Node head){

        // Naive Approach-1
        /*Node curr = head;
        while (curr != null){
            if(curr.visited){
                return true;
            }
            curr.visited = true;
            curr = curr.next;
        }

        return false;
        */

        // Naive Approach-2
        Node temp = new Node(121);
        Node curr = head;
        Node ncurr = null;
        while (curr != null){
            if(curr.next==temp){
                return true;
            }
            ncurr=curr.next;
            curr.next=temp;
            curr=ncurr;
        }

        return false;


        // Naive Approach-3
        /*HashSet<Node> hs = new HashSet<>();
        Node curr = head;
        while (curr != null){
            if(hs.contains(curr)){
                return true;
            }
            hs.add(curr);
            curr = curr.next;
        }

        return false;
        */

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head.next;

        System.out.println("Is there any cycle in LL : "+detectLoop(head));
    }
}

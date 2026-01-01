package LinkedList.Questions.LoopOrCycle;

import java.util.HashSet;

public class RemoveCycle {

    // For checking if there is any cycle in the Linked List or not.
    public static boolean hasCycle(Node head){
        if(head==null){
            System.out.println("no cycle");
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    // For removing cycle in LL
    public static void removeCycle(Node head){

        //----------Naive Approach---------
        /*if(head==null){
            return;
        }
        Node curr = head;
        HashSet<Node> hs = new HashSet<>();
        while (curr != null){
            hs.add(curr);
            if(hs.contains(curr.next)){
                curr.next=null;
                break;
            }
            curr=curr.next;
        }
        */


        // -----------Efficient Approach-----------
        if(head==null){
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }

        if(slow!=fast){
            System.out.println("no cycle");
            return;
        }
        slow = head;
        if(fast == head){
            while (fast.next!=slow){
                fast=fast.next;
            }
        }else {
            while (slow.next != fast.next){
                slow = slow.next;
                fast = fast.next;
            }
        }
        fast.next = null;

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head.next;

        System.out.println("Is there any cycle in the loop : "+hasCycle(head));

        removeCycle(head);

        System.out.println("After removing , is there any cycle in the loop : "+hasCycle(head));
    }
}

package LeetCode.LinkedList.Easy;

import java.util.HashSet;

public class IntersectionOfTwoLL {

    public static int getIntersectionNode(Node headA, Node headB) {

        Node curr1=headA;
        Node curr2 = headB;
        HashSet<Node> hs = new HashSet<>();
        while(curr1!=null){
            hs.add(curr1);
            curr1=curr1.next;
        }

        while(curr2!=null){
            if(hs.contains(curr2)){
                return curr2.data;
            }
            curr2=curr2.next;
        }

        return -1;
    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(30);
        head1.next.next.next=new Node(40);

        Node head2 = new Node(15);
        head2.next=new Node(13);
        head2.next.next=new Node(25);
        head2.next.next.next=head1.next.next;

        System.out.print("Your LL1 looks like this : ");
        Node.traversal(head1);
        System.out.print("\nYour LL2 looks like this : ");
        Node.traversal(head2);

        System.out.println("\nIntersected data is : "+getIntersectionNode(head1,head2));   // 30


    }
}

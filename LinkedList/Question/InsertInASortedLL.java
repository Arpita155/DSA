package LinkedList.Questions;

import java.util.Scanner;

public class InsertInASortedLL {

    public static Node insert(Node head, int value){
        Node temp = new Node(value);
        if(head == null){
            return temp;
        }
        if(value < head.data){
            temp.next=head;
            return temp;
        }

        Node curr = head;
        while (curr.next != null && curr.next.data < temp.data){
            curr = curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);


        System.out.print("Before inserting LL looks like this : ");
        Node.traversal(head);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the value : ");
        int value = sc.nextInt();

        head = insert(head,value);

        System.out.print("\nAfter inserting LL looks like this : ");
        Node.traversal(head);
    }
}

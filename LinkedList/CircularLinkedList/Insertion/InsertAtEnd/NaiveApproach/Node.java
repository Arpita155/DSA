package LinkedList.CircularLinkedList.Insertion.InsertAtEnd.NaiveApproach;

public class Node {

    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

    static Node insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        if(head == null){
            temp.next=temp;
            return temp;
        }

        Node curr = head;
        while (curr.next!=head){
            curr=curr.next;
        }
        curr.next=temp;
        temp.next=head;

        return head;
    }

    static void traverse(Node head){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        Node curr = head.next;
        System.out.print(head.data+" ");
        while (curr!=head){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=head;

        System.out.print("Before insertion : ");
        traverse(head);

        head=insertAtEnd(head,5);

        System.out.print("\nAfter insertion : ");
        traverse(head);
    }

}

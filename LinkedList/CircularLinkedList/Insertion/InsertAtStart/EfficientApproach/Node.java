package LinkedList.CircularLinkedList.Insertion.InsertAtStart.EfficientApproach;

public class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    static Node insertAtStart(Node head,int val){
        Node temp = new Node(val);
        temp.next=head.next;
        head.next=temp;
        // Swap (temp.data,head.data)
        int t = head.data;
        head.data=temp.data;
        temp.data=t;

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

        head=insertAtStart(head,5);

        System.out.print("\nAfter insertion : ");
        traverse(head);

    }
}

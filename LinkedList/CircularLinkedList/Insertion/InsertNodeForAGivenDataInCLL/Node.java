package LinkedList.CircularLinkedList.Insertion.InsertNodeForAGivenDataInCLL;

public class Node {

    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static Node sortedInsert(Node head, int data) {
        // code here
        Node temp = new Node(data);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        if(data < head.data){
            temp.next=head.next;
            head.next=temp;
            // Swap (temp.data,head.data)
            int t = head.data;
            head.data=temp.data;
            temp.data=t;
            return head;
        }
        Node curr = head;
        while(curr.next!=head && curr.next.data<temp.data){
            curr = curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;

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

        int data = 25;
        System.out.print("Before Inserting CLL looks like this : ");
        traverse(head);

        sortedInsert(head,data);

        System.out.print("\nAfter Inserting CLL looks like this : ");
        traverse(head);
    }
}

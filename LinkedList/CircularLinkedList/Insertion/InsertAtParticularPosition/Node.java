package LinkedList.CircularLinkedList.Insertion.InsertAtAParticularPosition;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

    static Node insertAtParticularPos(Node head, int val, int pos){
        Node temp = new Node(val);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        if(pos==1){
            temp.next=head.next;
            head.next=temp;
            // Swap (temp.data,head.data)
            int t = head.data;
            head.data=temp.data;
            temp.data=t;

            return head;
        }
        Node curr = head;
        int c=1;
        while (curr.next!=head){
            c++;
            curr=curr.next;
        }
        if(pos > c){
            System.out.println("\nInvalid position ");
            return head;
        }else {
            curr = head;
            int count = 1;
            while(count<pos-1){
                count++;
                curr=curr.next;
            }
            temp.next=curr.next;
            curr.next=temp;

            return head;
        }

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
        head.next = new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=head;

        System.out.print("Before insertion : ");
        traverse(head);

        head= insertAtParticularPos(head,50,3);

        System.out.print("\nAfter insertion : ");
        traverse(head);
    }
}

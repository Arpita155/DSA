package LinkedList.DoublyLinkedList;

public class InsertAtStartOfDLL {

    public static Node insertAtStart(Node head, int v){

        //Approach-1     T.C = O(1)
        /*Node temp = new Node(v);
        if(head==null){
            return temp;
        }
        if(head.next==null){
            temp.next=head;
            head.prev=temp;
            return temp;
        }
        temp.next=head.next;
        Node curr = head.next;
        curr.prev=temp;
        head.next=temp;
        temp.prev=head;

        int t=head.data;
        head.data=temp.data;
        temp.data=t;

        return head;
        */

        //Approach-2     T.C = O(1)
        Node temp = new Node(v);
        temp.next=head;
        head.prev=temp;

        return temp;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.print("Before insertion Your DLL looks like this : ");
        Node.traversal(head);

        head = insertAtStart(head,5);

        System.out.print("\nAfter insertion Your DLL looks like this : ");
        Node.traversal(head);
    }
}

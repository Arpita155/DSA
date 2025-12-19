package LinkedList.Questions;

public class RemoveDuplicateFromSortedLL {

    static void removeDuplicates(Node head) {

        // T.C = O(n)   S.C = O(1)
        if(head == null || head.next==null){
            return;
        }

        Node curr = head;
        while(curr.next != null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }else{
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(10);
        head.next.next=new Node(40);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(40);

        System.out.print("Before removing duplicate : ");   // 10 10 40 40 40
        Node.traversal(head);

        removeDuplicates(head);

        System.out.print("\nAfter removing duplicate : ");    // 10 40
        Node.traversal(head);
    }
}

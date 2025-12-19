package LinkedList.CircularLinkedList;

public class Traversal {

    int data;
    Traversal next;

    Traversal(int value){
        this.data=value;
        this.next=null;
    }

    static void traverse(Traversal head){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        Traversal curr = head.next;
        System.out.print(head.data+" ");
        while (curr!=head){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        Traversal head = new Traversal(10);
        head.next=new Traversal(20);
        head.next.next=new Traversal(30);
        head.next.next.next=head;
        traverse(head);

    }
}

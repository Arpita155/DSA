package LinkedList;

class InsertAtEnd {
    int data;
    InsertAtEnd next;

    InsertAtEnd(int value){
        this.data = value;
        this.next = null;
    }
}

public class Implementation {

    static void traversal(InsertAtEnd head){

        // -----------Iterative Traversal--------
        if(head == null){
            System.out.println("list is empty.");
            return;
        }

        InsertAtEnd curr = head;
        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }

        // --------Recursive Traversal------------
        /*if(head == null){
            return;
        }
        System.out.println(head.data);
        traversal(head.next);
        */
    }

    public static void main(String[] args) {
        InsertAtEnd head = new InsertAtEnd(10);
        InsertAtEnd p1 = new InsertAtEnd(20);
        InsertAtEnd p2 = new InsertAtEnd(30);
        InsertAtEnd p3 = new InsertAtEnd(40);

        head.next = p1;
        p1.next=p2;
        p2.next=p3;

        traversal(head);   // 10 20 30 40
    }
}



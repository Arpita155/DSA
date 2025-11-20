package LinkedList.Insertion;

public class InsertAtEnd {
    int data;
    InsertAtEnd next;

    InsertAtEnd(int value){
        this.data=value;
        this.next=null;
    }

    public static void insert(InsertAtEnd head, int key){
        InsertAtEnd temp = new InsertAtEnd(key);
        if(head == null){
            return;
        }else{
            InsertAtEnd curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next=temp;
        }
    }

    static void traversal(InsertAtEnd head) {

        // --------Recursive Traversal------------
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        traversal(head.next);

    }

    public static void main(String[] args) {
        InsertAtEnd head = new InsertAtEnd(10);
        head.next = new InsertAtEnd(20);
        head.next.next = new InsertAtEnd(30);

        System.out.print("Before inserting the element,Linked list looks like this : ");
        traversal(head);        // Before inserting element.

        insert(head,50);

        System.out.print("\nAfter inserting the element,Linked list looks like this : ");
        traversal(head);       // After inserting element.

    }
}

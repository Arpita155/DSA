package LinkedList.Deletion.DeleteAtAParticularPosition;

class Node {
    int data;
    Node next;

    Node(int value){
        this.data = value;
        this.next = null;
    }

    public static Node delete(Node head,int k){
        if(head == null){
            System.out.println("LL is empty");
            return head;
        }
        if(head.next!=null && k==1){
            head=head.next;
            return head;
        }
        Node curr = head;
        for(int i=1;i<k-1;i++){
            if(curr == null){
                System.out.println("\nIt is Invalid position in the list, the node in this position you want to delete");
                return head;
            }
            curr = curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }

    static void traversal(Node head) {
        // --------Recursive Traversal------------
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        traversal(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(20);
        int key = 1;

        System.out.print("Before deletion the list looks like this : ");
        traversal(head);

        head=delete(head,key);
        System.out.print("\nAfter deletion the list looks like this : ");   // 10 20
        traversal(head);
        System.out.println("\nAfter deletion head.data = "+head.data);   // 10

    }
}


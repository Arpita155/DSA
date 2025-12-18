package LinkedList.CircularLinkedList.Deletion.DeleteAtGivenPosition;

class Node {
    int data;
    Node next;

    Node(int value){
        this.data = value;
        this.next = null;
    }

    public static Node delete(Node head,int k){
        if(head == null || k<=0){
            System.out.println("\nCLL is empty or invalid position");
            return head;
        }
        if(k==1){
            // if one node is there in the list.
            if(head.next==head){
                head=null;
                return head;
            }

            // More than one node in the list and k==1
            Node curr = head;
            while (curr.next!=head){
                curr=curr.next;
            }
            curr.next=head.next;
            return head.next;
        }
        // k > 1
        Node curr = head;
        int count = 1;
        while(curr.next!=head){
            count++;
            curr=curr.next;
        }
        if(k>count){
            System.out.println("\nIt is Invalid position in the list.");
            return head;
        }else{
            curr=head;
            for(int i=1;i<k-1;i++){
                curr = curr.next;
            }
            curr.next=curr.next.next;
        }

        return head;
    }

    static void traversal(Node head) {
        if(head == null){
            System.out.println("Empty CLL");
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
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next=new Node(30);
        head.next.next.next.next=head;
        int key = 2;

        System.out.print("Before deletion the list looks like this : ");  // For 2 :  5 10 20 30
        traversal(head);

        head=delete(head,key);
        System.out.print("\nAfter deletion the list looks like this : ");   // For 2 :  5 20 30
        traversal(head);

    }
}
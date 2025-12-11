package LinkedList.Questions;

public class MiddleElementOfLL {

    static void getMiddle(Node head) {

        // ------------Approach-1 : Naive Approach ----------     T.C = O(n) 2 times traversal(2 loop)
        /*if(head==null){
            System.out.println("Empty CLL");
            return;
        }
        if(head.next==null){
            System.out.println(head.data);
            return;
        }
        Node curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }

        curr = head;

        for(int i=1;i<=count/2;i++){
            curr=curr.next;
        }

        System.out.println(curr.data);
        */


        // ---------------Approach-2 :  Efficient Approach --------------  T.C = O(n) 1 time traversal(1 loop)
        if(head==null){
            System.out.println("Empty CLL");
            return;
        }
        if(head.next==null){
            System.out.println(head.data);
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);


    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        // Your LL will looks like this : 10 20 30 40
        getMiddle(head);   // 30
    }
}

package LeetCode.LinkedList.Medium;

import java.util.Stack;

public class ReverseLLByGivenPositon {

    public static Node reverseBetween(Node head, int left, int right) {
        Stack<Integer> st = new Stack<>();
        Node curr = head;
        int c = 1;
        while(c<left && curr.next!=null){
            curr= curr.next;
            c++;
        }
        Node temp = curr;
        int l = left;
        int r = right;
        while(l <= r){
            st.push(curr.data);
            curr = curr.next;
            l++;
        }

        while(left <= right){
            temp.data = st.pop();
            temp = temp.next;
            left++;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(30);
        head1.next.next.next=new Node(40);
        head1.next.next.next.next=new Node(50);

        System.out.print("Before reversing your ll looks like this : ");
        Node.traversal(head1);

        System.out.print("\nAfter reversing your ll looks like this : ");
        Node.traversal(reverseBetween(head1,2,4));
    }
}

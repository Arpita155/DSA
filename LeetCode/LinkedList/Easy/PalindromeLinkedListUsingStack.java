package LeetCode.LinkedList.Easy;

import java.util.Stack;

public class PalindromeLinkedListUsingStack {

    public static boolean isPalindrome(Node head) {
        Stack<Integer> st = new Stack<>();
        Node curr = head;
        while(curr != null){
            st.push(curr.data);
            curr = curr.next;
        }
        curr = head;
        while(curr != null){
            if(curr.data != st.pop()){
                return false;
            }
            curr = curr.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(20);
        head1.next.next.next=new Node(10);

        System.out.println("Is the LL palindrome : "+isPalindrome(head1));
    }
}

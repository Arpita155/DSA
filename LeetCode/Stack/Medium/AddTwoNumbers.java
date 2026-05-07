package LeetCode.Stack.Medium;

import java.util.Stack;

public class AddTwoNumbers {

    public static Node helper(Node l1, Node l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (l1 != null) {
            stack1.push(l1.data);
            l1 = l1.next;
        }

        while (l2 != null) {
            stack2.push(l2.data);
            l2 = l2.next;
        }

        Node result = null;
        int carry = 0;

        while (!stack1.empty() || !stack2.empty() || carry != 0) {
            int digit1 = !stack1.empty() ? stack1.pop() : 0;
            int digit2 = !stack2.empty() ? stack2.pop() : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            Node newNode = new Node(digit);
            newNode.next = result;
            result = newNode;
        }

        return result;
    }

    public static Node addTwoNumbers(Node l1, Node l2) {
        Node ans = helper(l1, l2);
        return ans;
    }

    public static void main(String[] args) {
        Node head1 = new Node(7);
        head1.next = new Node(2);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(3);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        Node.traversal(addTwoNumbers(head1,head2));    // 7 8 0 7

    }
}

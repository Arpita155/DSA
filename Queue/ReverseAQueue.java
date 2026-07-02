package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {

    public static void reverseQueue(Queue<Integer> q) {
        // code here

        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Before reversing : "+q);

        reverseQueue(q);

        System.out.println("After reversing : "+q);
    }
}

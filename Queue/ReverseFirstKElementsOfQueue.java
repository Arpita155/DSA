package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsOfQueue {

    public static Queue<Integer> reverseElements(Queue<Integer> q, int k){
        // Write your code here.
        Stack<Integer> q1 = new Stack<>();
        int j = 0;

        while(!q.isEmpty() && j<k){
            q1.push(q.remove());
            j++;

        }

        while(!q1.isEmpty()){
            q.add(q1.pop());
        }

        int remaining = q.size()-k;
        for(int i=0;i<remaining;i++){
            q.add(q.poll());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Original queue : "+q);   // [ 10,20,30,40,50]

        System.out.println("After reversing first k elements : "+reverseElements(q,3));  // [30, 20, 10, 40, 50]
    }
}

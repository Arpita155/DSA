package Queue.CreateQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingQueueInterface {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(15);
        q.offer(20);
        q.offer(30);
        System.out.print("After inserting elements queue looks like this : "+q);  //  [10, 15, 20, 30]

        q.remove();
        q.poll();
        System.out.print("\nAfter deleting elements queue looks like this : "+q+"\n");  // [20, 30]

        System.out.println(q.element());  // 20
        System.out.println(q.peek());      // 20

        System.out.println("Is the queue empty : "+q.isEmpty());   // false
        System.out.println("Size of the queue is : "+q.size());      // 2
        System.out.println(q.contains(30));   // true
        
        q.clear();
        System.out.println("It is empty queue after clearing it "+q);   // []


    }
}

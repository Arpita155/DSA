package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicOperationsOnQueue {

    Queue<Integer> q;

    public BasicOperationsOnQueue() {
        // initialize your queue
        q = new LinkedList<>();
    }

    public void enqueue(int x) {
        // insert x into queue
        q.add(x);
    }

    public void dequeue() {
        // remove front element from queue
        if(!q.isEmpty()){
            q.remove();
        }
    }

    public int getFront() {
        // return the front element of the queue
        if(q.isEmpty()){
            return -1;
        }
        return q.peek();
    }

    public int getRear() {
        // return the rear element of the queue

        if (q.isEmpty()) {
            return -1;
        }
        // LinkedList allows us to cast or fetch the last element directly
        return ((LinkedList<Integer>) q).getLast();
    }

    public boolean isEmpty() {
        // check whether the queue is empty
        return q.isEmpty();
    }

    public int size() {
        // return the size of the queu
        return q.size();
    }
    public void showQueue(){
        System.out.println(q);
    }

    public static void main(String[] args) {

        BasicOperationsOnQueue obj = new BasicOperationsOnQueue();

        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.showQueue();

        obj.dequeue();
        obj.showQueue();
        System.out.println("Size of the queue is : "+obj.size());
        System.out.println("Is the queue empty ? : "+obj.isEmpty());
        System.out.println("Front of the queue is : "+obj.getFront());
        System.out.println("Rear of the queue is : "+obj.getRear());

    }
}

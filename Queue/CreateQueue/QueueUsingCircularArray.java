package Queue.CreateQueue;

import java.util.Arrays;

public class QueueUsingCircularArray {

    int[]a;
    int capacity;
    int size;
    int front;

    QueueUsingCircularArray(int c){
        this.capacity=c;
        this.a = new int[c];
        this.size = 0;
        this.front=-1;
    }

    boolean isFull(){
        return size==capacity;
    }

    boolean isEmpty(){
        return size==0;
    }

    int getFront(){
        if(isEmpty()){
            return -1;
        }
        return front;
    }

    int getRear(){
        if (isEmpty()){
            return -1;
        }
        return (front+size-1)%capacity;
    }

    void enqueue(int v){
        if(isFull()){
            return;
        }
        int rear = getRear();
        if(isEmpty()){
            front = 0;
        }
        rear = (rear+1)%capacity;
        a[rear]=v;
        size++;
    }

    int dequeue(){
        if(isFull()){
            return -1;
        }
        int temp = a[front];
        a[front]=0;
        front = (front+1)%capacity;
        size--;
        return temp;
    }


    public static void main(String[] args) {
        QueueUsingCircularArray q = new QueueUsingCircularArray(5);

        System.out.println("Size of the Queue is "+q.size);
        System.out.println("Is the queue empty : "+q.isEmpty());

        // -----enqueue elements---------
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        // -----Dequeue elements--------
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.enqueue(50);
        q.enqueue(60);

        System.out.println("Size of the Queue is : "+q.size);
        System.out.println("Is the queue empty : "+q.isEmpty());
        System.out.println("Your queue look like this : "+ Arrays.toString(q.a));
        System.out.println("Front element of the queue is : "+q.getFront());
        System.out.println("Rear element of the queue is : "+q.getRear());


    }
}

package Queue.CreateQueue;

import java.util.Arrays;
import java.util.Scanner;

public class QueueUsingArray {

    int[]arr;
    int capacity;
    int size;
    int front;
    int rear;

    QueueUsingArray(int c){
        this.capacity = c;
        arr = new int[c];
        this.rear = this.front =-1;
        size = 0;
    }

    int getSize(){
        return this.size;
    }

    boolean isEmpty(){
        return size==0;
    }

    int getFront(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    int getRear(){
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }

    void enqueue(int v){
        if(size == capacity){
            System.out.println("Queue is full, can't enqueue element");
            return;
        }
        if(size <= capacity-1){
            if(front==-1){
                front++;
                rear++;
                arr[rear]=v;
            }else{
                rear++;
                arr[rear]=v;
            }
            size++;
        }
    }

    void dequeue(){
        if(front == -1){
            System.out.println("Queue is empty , can't dequeue element");
            return;
        }
        if(size == 1){
            arr[rear]=0;
            rear = -1;
            front = -1;
            size--;
        }else{
            arr[front]=0;
            front++;
            size--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the Queue : ");
        int c = sc.nextInt();

        QueueUsingArray q = new QueueUsingArray(c);

        System.out.println("Size of the Queue is "+q.getSize());
        System.out.println("Is the queue empty : "+q.isEmpty());

        // -----enqueue elements---------
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        // -----Dequeue elements--------
        q.dequeue();

        System.out.println("Size of the Queue is : "+q.getSize());
        System.out.println("Is the queue empty : "+q.isEmpty());
        System.out.println("Your queue look like this : "+ Arrays.toString(q.arr));
        System.out.println("Front element of the queue is : "+q.getFront());
        System.out.println("Rear element of the queue is : "+q.getRear());
    }
}

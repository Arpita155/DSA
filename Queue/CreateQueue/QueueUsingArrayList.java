package Queue.CreateQueue;

import java.util.ArrayList;

public class QueueUsingArrayList {

    ArrayList<Integer> al;

    QueueUsingArrayList(){
        al = new ArrayList<>();
    }

    boolean isEmpty(){
        return al.size() == 0;
    }

    int getSize(){
        return al.size();
    }

    int getFront(){
        if(isEmpty()){
            return -1;
        }
        return al.getFirst();
    }

    int getRear(){
        if (isEmpty()){
            return -1;
        }
        return al.get(al.size()-1);
    }

    void enqueue(int v){
        al.add(v);
    }

    int dequeue(){
        if(al.isEmpty()){
            return -1;
        }
        int temp = al.get(0);
        al.removeFirst();
        return temp;
    }

    public static void main(String[] args) {

        QueueUsingArrayList q = new QueueUsingArrayList();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.al);

        q.dequeue();
        System.out.println(q.al);

        System.out.println(q.isEmpty());   // false
        System.out.println("size of the queue is :"+q.getSize());
        System.out.println(q.getFront());   // 2
        System.out.println(q.getRear());   // 4
    }
}

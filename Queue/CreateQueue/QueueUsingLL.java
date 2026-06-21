package Queue.CreateQueue;

public class QueueUsingLL {
    Node front,rear;
    int size;

    QueueUsingLL(){
        front=rear=null;
        size = 0;
    }

    boolean isEmpty(){
        return (this.front == null);
    }

    int getSize(){
        return this.size;
    }

    int getFront(){
        return this.front.data;
    }

    int getRear(){
        return this.rear.data;
    }

    void enqueue(int v){
        Node temp = new Node(v);

        if(front == null){
            front = rear = temp;
        }else{
            rear.next=temp;
            rear = temp;
        }
        size++;
    }

    void dequeue(){
        if(this.front == null){
            return ;
        }
        if(this.getSize() == 1){
            this.front=null;
            this.rear=null;
        }else{
            front=front.next;
        }
        size--;
    }

    public static void main(String[] args) {

        QueueUsingLL q = new QueueUsingLL();

        System.out.println("Is the queue empty : "+q.isEmpty());
        System.out.println("Size of the queue is : "+q.getSize());

        // Enqueue element
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        // dequeue element
        q.dequeue();

        System.out.println("Is the queue empty : "+q.isEmpty());
        System.out.println("Size of the queue is : "+q.getSize());
        System.out.print("Your queue looks like this : ");
        Node.traversal(q.front);

        System.out.println("\nFront element of the queue is : "+q.getFront());
        System.out.println("Rear element of the queue is : "+q.getRear());
    }
}

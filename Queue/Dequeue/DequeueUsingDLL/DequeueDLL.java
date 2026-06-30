package Queue.dequeue.DequeueUsingDLL;

public class DequeueDLL {

    int size;
    Node front;
    Node rear;

    DequeueDLL(){
        this.rear=null;
        this.front=null;
        size=0;
    }

    public void insertFront(int v){
        Node temp = new Node(v);
        if(front == null){
            rear = temp;
        }else{
            temp.next= front;
            front.prev=temp;
        }

        size++;
        this.front = temp;
    }

    public void insertRear(int v){
        Node temp = new Node(v);
        if(front == null){
            size++;
            this.front = temp;
            rear = temp;
        }else {
            rear.next = temp;
            temp.prev = rear;
            rear = temp;
            size++;
        }
    }

    public void removeFront(){
        if(front == null || front.next == null){
            size = 0;
            rear = null;
            front = null;
        }else {
            Node temp = front.next;
            front.next = null;
            temp.prev = null;
            size--;
            this.front =  temp;
        }
    }

    public void removeRear(){
        if(front == null || front.next == null){
            size = 0;
            rear = null;
            front = null;
        }else{
            Node pre = rear.prev;
            rear.prev=null;
            pre.next=null;
            rear = pre;
        }

        size--;
    }

    public int getSize(){
        if(front == null){
            return 0;
        }
        if(front.next==null){
            return 1;
        }

        return size;
    }

    public int getFront(){
        if(front == null){
            System.out.println("Empty Dequeue");
            return 0;
        }
        return front.data;
    }

    public int getRear(){
        if(front == null){
            System.out.println("Empty Dequeue");
            return 0;
        }
        return rear.data;
    }



    public static void main(String[] args) {

        DequeueDLL dq = new DequeueDLL();

        dq.insertFront(10);
        System.out.print("Your DLL looks like this : ");
        Node.traversal(dq.front);

        System.out.println("\nsize of the LL is : "+dq.getSize());

        dq.insertFront(11);
        dq.insertFront(9);
        System.out.print("Your DLL looks like this : ");
        Node.traversal(dq.front);

        dq.insertRear(55);
        System.out.print("\nYour DLL looks like this : ");
        Node.traversal(dq.front);

        dq.removeFront();
        System.out.print("\nYour DLL looks like this : ");
        Node.traversal(dq.front);

        dq.removeRear();
        System.out.print("\nYour DLL looks like this : ");
        Node.traversal(dq.front);

        System.out.println("\nSize of the LL is : "+dq.getSize());
        System.out.println("Font element is : "+dq.getFront());
        System.out.println("Last element is : "+dq.getRear());
    }
}

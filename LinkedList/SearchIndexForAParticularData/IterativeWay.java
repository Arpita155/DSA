package LinkedList.SearchIndexForAParticularData;


class Node {
    int data;
    Node next;

    Node(int value){
        this.data = value;
        this.next = null;
    }
}


public class IterativeWay {

    public static int search(Node head, int key){
        if(head == null){
            return -1;
        }
        int pos = 1;
        Node curr = head;
        while (curr != null){
            if(curr.data == key){
                return pos;
            }else{
                curr = curr.next;
                pos++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int key = 30;
        int index = search(head,key);

        System.out.println("Index of the key is : "+index);
    }


}

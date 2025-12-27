package LinkedList.Questions.LoopOrCycle;

public class DetectLoopInLLEfficientApproach {

    public static boolean detectLoop(Node head){
        Node f = head;
        Node s = head;
        while (f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
            if(s==f){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head.next;

        System.out.println("Is there any cycle in LL : "+detectLoop(head));
    }
}

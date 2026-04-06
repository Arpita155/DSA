package Stack.CreateStack.CreateStackUsingLinkedList;

public class CreateStackUsingLL {

    static int stackSize;
    public static boolean isEmpty(Node head){
        return head == null;
    }

    public static Node push(Node head,int value){
        Node temp = new Node(value);
        stackSize++;
        if(head == null){
            return temp;
        }
        temp.next = head;
        return temp;
    }

    public static Node pop(Node head){
        // handle the UNDERFLOW problem
        if(head == null){
            System.out.print("Error : Stack is empty. so we can't pop elements from stack. ");
            System.out.println(Integer.MAX_VALUE);
            return head;
        }
        stackSize--;
        int res = head.data;
        System.out.println("Popped element is : "+res);
        head = head.next;
        return head;
    }

    public static int peek(Node head){
        if(isEmpty(head)){
            System.out.print("Error : Stack is empty. ");
            return Integer.MAX_VALUE;
        }
        return head.data;
    }

    public static int size(){
        return stackSize;
    }

    public static void main(String[] args) {
        // When the stack is empty
        Node head = null;
        System.out.println("Is the stack empty : "+isEmpty(null));
        System.out.println("Size of the stack is : "+stackSize);
        System.out.println(peek(head));
        head = pop(head);

        System.out.println("============================");
        // When stack is not empty
        head = push(head,10);
        head = push(head,20);
        System.out.print("Your stack will look like this : ");
        Node.traversal(head);
        System.out.println("\nIs the stack empty : "+isEmpty(head));
        head = pop(head);
        System.out.print("Your stack will look like this : ");
        Node.traversal(head);
        System.out.println("\nSize of the stack is : "+stackSize);
        System.out.println("Peeked element is : "+peek(head));
    }
}

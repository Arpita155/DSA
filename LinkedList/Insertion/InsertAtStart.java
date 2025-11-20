package LinkedList.Insertion;

import java.util.Scanner;

public class InsertAtStart {

    int data;
    InsertAtStart next;

    InsertAtStart(int value){
        this.data=value;
        this.next=null;
    }

    public static InsertAtStart insert(InsertAtStart head, int key){
        InsertAtStart temp = new InsertAtStart(key);
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {
        InsertAtStart head = new InsertAtStart(10);
        head.next = new InsertAtStart(20);
        head.next.next = new InsertAtStart(30);

        System.out.println(head.data);   // Before inserting key element head.data = 10
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key :");
        int key = sc.nextInt();

        head = insert(head,key);

        System.out.println(head.data);   // After inserting key element head.data = 5
    }
}

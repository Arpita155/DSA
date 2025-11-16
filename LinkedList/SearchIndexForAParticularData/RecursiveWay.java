package LinkedList.SearchIndexForAParticularData;

import java.util.Scanner;

class FindIndex{
    int data;
    FindIndex next;

    FindIndex(int value){
        this.data=value;
        this.next=null;
    }
}
public class RecursiveWay {

    int pos = -1;
    public int search(FindIndex head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 1;
        }else{
            int pos = search(head.next,key);
            if(pos == -1){
                return -1;
            }else {
                return 1+pos;
            }
        }
    }
    public static void main(String[] args) {

        FindIndex head = new FindIndex(10);
        head.next=new FindIndex(20);
        head.next.next=new FindIndex(30);
        head.next.next.next=new FindIndex(40);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key : ");
        int key = sc.nextInt();   // For 30

        RecursiveWay obj = new RecursiveWay();
        System.out.println("The index of the key "+key+" is : "+obj.search(head,key));   // Output : The index of the key 30 is : 3
    }
}

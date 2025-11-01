package DivideAndConquer.Heap;

import java.util.Arrays;
import java.util.Scanner;

// ------------------------------------Insertion for max heap------------------------
public class InsertionMaxHeap {


    int []h;
    int capacity;
    int size;

    public InsertionMaxHeap(int c){
        this.size = 0;
        this.capacity = c;
        h = new int[c];
    }
    public int parent(int i){
        return (i-1)/2;
    }

    public void insert(int element){
        if(size==capacity){      // check if heap is full or not.
            System.out.println("Bhas heap full");
            return;
        }
        h[size] = element;
        int idx = size;
        size++;

        while (idx!=0 && h[parent(idx)]<element){
            int temp = h[parent(idx)];
            h[parent(idx)] = element;
            h[idx] =  temp;
            idx = parent(idx);
        }
    }

    void showHeap(){
        System.out.println("Your heap looks like this "+Arrays.toString(h));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity: ");
        int c = sc.nextInt();

        InsertionMaxHeap obj = new InsertionMaxHeap(c);    // For 10
        System.out.println("Enter elements to insert in the heap : ");
        obj.insert(sc.nextInt());    // 30
        obj.insert(sc.nextInt());    // 31
        obj.insert(sc.nextInt());      // 10
        obj.insert(sc.nextInt());      // 25
        obj.insert(sc.nextInt());      // 50


        obj.showHeap();    // [50, 31, 10, 25, 30, 0, 0, 0, 0, 0]

    }
}

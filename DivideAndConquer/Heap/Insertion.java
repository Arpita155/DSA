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
    public static int parent(int i){
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

        InsertionMaxHeap obj = new InsertionMaxHeap(10);
        obj.insert(30);
        obj.insert(31);
        obj.insert(10);
        obj.insert(25);
        obj.insert(50);
        obj.insert(35);

        obj.showHeap();    // [50, 31, 35, 25, 30, 10, 0, 0, 0, 0]

    }
}

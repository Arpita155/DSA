package DivideAndConquer.Heap;

import java.util.Arrays;
import java.util.Scanner;

// ------------------------------Delete Elements from MaxHeap---------------------------
//--------Steps-------
//(i). First Create Heap (insert elements to make a heap).
// (ii). Then Delete elements.
public class DeletionMaxHeap {

    int []heap;
    int capacity;
    int size;

    DeletionMaxHeap(int c){
        capacity=c;
        size=0;
        heap=new int[c];
    }

    int parent(int i){
        return (i-1)/2;
    }
    int leftChild(int i){
        return 2*i+1;
    }
    int rightChild(int i){
        return 2*i+2;
    }

    void swap(int l,int r){
        int temp = heap[l];
        heap[l]=heap[r];
        heap[r]=temp;
    }

    void insert(int element){
        if(size==capacity){
            System.out.println("Heap is full, we can't insert element");
            return;
        }
        heap[size]=element;
        size++;
        this.heapifyUp(element);
    }

    void heapifyUp(int element){
        int i = size-1;   // tracks the index of the element .
        while (i!=0 && heap[parent(i)]<element) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    int delete(){
        if(size==0){
            System.out.println("Heap faka..");
            return Integer.MAX_VALUE;
        }
        int max = heap[0];
        swap(0,size-1);
        size--;
        heapifyDown(0);
        return max;
    }

    void heapifyDown(int i){
        int largestIndex = i;
        int lcIndex = leftChild(i);
        int rcIndex = rightChild(i);
        if(lcIndex < size && heap[lcIndex]>heap[largestIndex]){
            largestIndex = lcIndex;
        }
        if(rcIndex < size && heap[rcIndex]>heap[largestIndex]){
            largestIndex = rcIndex;
        }
        if(largestIndex != i) {
            swap(largestIndex, i);
            heapifyDown(largestIndex);
        }
    }

    void showHeap(){
        System.out.println("Your heap looks like this : "+Arrays.toString(heap));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity : ");
        int c = sc.nextInt();

        DeletionMaxHeap obj = new DeletionMaxHeap(c);
        System.out.println("Enter elements to insert into the heap ");
        obj.insert(sc.nextInt());
        obj.insert(sc.nextInt());
        obj.insert(sc.nextInt());
        obj.insert(sc.nextInt());
        obj.insert(sc.nextInt());

        System.out.print("After inserting the elements ");
        obj.showHeap();     // After inserting the elements Your heap looks like this : [234, 24, 35, 12, 17, 0, 0]

        obj.delete();

        System.out.print("After deleting the elements ");
        obj.showHeap();     // After deleting the elements Your heap looks like this : [35, 24, 17, 12, 234, 0, 0]
        System.out.println("Deleted element is : "+obj.heap[obj.size]);  // Deleted element is : 234
        System.out.println("Size of heap right now :"+obj.size);         // Size of heap right now :4
    }
}

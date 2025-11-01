package DivideAndConquer.Heap;

import java.util.Arrays;
import java.util.Scanner;

public class DeletionMinHeap {

    int[] heap;
    int capacity;
    int size;

    DeletionMinHeap(int c){
        capacity = c;
        size = 0;
        heap = new int[c];
    }
    int parent (int i){
        return (i-1)/2;
    }
    int leftChild(int i){
        return (2*i+1);
    }
    int rightChild(int i){
        return (2*i+2);
    }

    void swap(int l, int r){
        int temp = heap[l];
        heap[l]=heap[r];
        heap[r]=temp;
    }

    void insert(int element){
        if(size==capacity){
            System.out.println("Heap if full , we cant insert element");
            return;
        }
        heap[size]=element;
        size++;
        heapifyUp(element);
    }

    void heapifyUp(int element){
        int i = size-1;
        while (i !=0 && heap[parent(i)]>element){
            swap(i,parent(i));
        }
        i = parent(i);
    }

    int Delete(){
        if(size==0){
            System.out.println("Heap faka...");
            return Integer.MAX_VALUE;
        }
        int min = heap[0];
        swap(0,size-1);
        size--;
        heapifyDown(0);
        return min;
    }

    void heapifyDown(int i){
        int largestIndex = i;
        int lcIndex = leftChild(i);
        int rcIndex = rightChild(i);
        if (lcIndex < size && heap[lcIndex]<heap[largestIndex]){
            largestIndex = lcIndex;
        }
        if(rcIndex < size && heap[rcIndex]<heap[largestIndex]){
            largestIndex = rcIndex;
        }
        if(largestIndex != i){
            swap(i,largestIndex);
            heapifyDown(largestIndex);
        }
    }

    void showHeap(){
        System.out.println(Arrays.toString(heap));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity : ");
        int c = sc.nextInt();

        DeletionMinHeap obj = new DeletionMinHeap(c);
        System.out.println("Enter elements to insert the heap");
        obj.insert(sc.nextInt());
        obj.insert(sc.nextInt());
        obj.insert(sc.nextInt());
        obj.insert(sc.nextInt());
        obj.insert(sc.nextInt());

        obj.showHeap();

        obj.Delete();
        obj.Delete();
        obj.Delete();
        obj.Delete();
        obj.Delete();

        obj.showHeap();
        System.out.println("Deleted element is : "+obj.heap[obj.size]);
    }
}

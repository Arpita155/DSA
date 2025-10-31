package DivideAndConquer.Heap;

import java.util.Scanner;

public class FormulasOfParentAndLeft_RightChild {

    public static int parent(int i){
        return (i-1)/2;
    }
    public static int leftChild(int i){
        return (2*i+1);
    }
    public static int rightChild(int i){
        return (2*i+2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []heap = {10,20,30,40,50,60,80};
        System.out.println("Enter the index: ");  // For index 2
        int i = sc.nextInt();
        System.out.println("Parent element of index "+i+" is " +heap[parent(i)]);   //For index 2 : parent is 10
        System.out.println("Left child of index "+i+" is "+heap[leftChild(i)]);     //For index 2 : left child is 60
        System.out.println("Right child of index "+i+" is "+heap[rightChild(i)]);   //For index 2 : right child is 80
    }
}

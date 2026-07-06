package Queue.dequeue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class KSizedSubArrayMaximum {

    public static void maxOfSubArrays(int[] arr, int k) {

        //-------- Brute Force Approach ------------ T.C = O(O(n-k)*k)
        /*ArrayList<Integer> maxElement = new ArrayList<>();
        ArrayList<Integer> minElement = new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++){
            int max = arr[i];
            int min = arr[i];
            for(int j=i+1;j<i+k;j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            for(int j=i+1;j<i+k;j++){
                if(arr[j] < min){
                    min = arr[j];
                }
            }

            maxElement.add(max);
            minElement.add(min);
        }

        System.out.println(maxElement);
        System.out.println(minElement);*/

        // ----------- Efficient Approach ------------ T.C = O(

        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<k;i++){
            // -----Insertion Logic----
             /*check the last element of the dequeue , if it is smaller than arr[i] than remove it
             else just add 'i' to the dequeue*/

            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        res.add(arr[dq.peek()]);

        for(int i=k;i<arr.length;i++){
            // ----- Removal logic ------
            // If the first element of the dequeue is not the part of my subArray then remove it.
            if(dq.peekFirst() <= (i-k)){
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);

            res.add(arr[dq.peek()]);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[]arr = {6,5,3,1,4,5,2,3,6};
        int k = 3;
        maxOfSubArrays(arr,k);   // output : [6, 5, 4, 5, 5, 5, 6]


    }
}

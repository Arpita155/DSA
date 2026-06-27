package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FixedDigitsNNumbers {

    public static void printNNumbers(int n,int[]arr){
        
        // Optimal Approach 
        Queue<String> queue = new LinkedList<>();
        for(int i : arr){
            queue.add(String.valueOf(i));
        }

        for(int i=0;i<n;i++){
            String curr = queue.remove();
            System.out.println(curr);

            queue.add(curr+ arr[0]);
            queue.add(curr+ arr[1]);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[]arr = {5,6};
        printNNumbers(n,arr);
    }
}

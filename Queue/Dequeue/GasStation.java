package Queue.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class GasStation {

    public static int gasStation(int[]gas,int[]cost){

        // ------- Naive Approach  ------ T.C = O(n^2)  S.C = O(1)
        /*for(int start=0;start<gas.length;start++){
            int end = start;
            int curr_petrol = 0;
            while(true){
                curr_petrol += (gas[end]-cost[end]);
                if(curr_petrol < 0){
                    break;
                }
                end = (end+1)%gas.length;
                if(end == start){
                    return start;
                }
            }
        }
        return -1;*/

        // ----- Efficient Approach -----
        int n = gas.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int currPetrol = 0;
        int i = 0;

        // Loop up to 2 * n to handle the circular wrap-around
        while (dq.size() < n) {
            // Add the current station to the back of the queue
            dq.addLast(i);
            currPetrol += (gas[i] - cost[i]);

            // Shrink the window from the front if petrol drops below zero
            while (!dq.isEmpty() && currPetrol < 0) {
                int removedStation = dq.removeFirst();
                // Subtract the net petrol of the REMOVED station, not station 'i'
                currPetrol -= (gas[removedStation] - cost[removedStation]);
            }

            // Move to the next station circularly
            i = (i + 1) % n;

            // If the queue size equals the total number of stations, we found a valid start
            if (dq.size() == n) {
                return dq.peekFirst();
            }
        }



        return -1;
    }

    public static void main(String[] args) {
//        int[]gas = {4,5,7,4};
//        int []cost = {6,6,3,5};

//        int[]gas = {4,8,7,4};
//        int []cost = {6,5,3,5};

        int[]gas = {3,9};
        int []cost = {7,6};
        System.out.println(gasStation(gas,cost));
    }
}

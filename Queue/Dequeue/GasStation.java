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

        // ------ Efficient Approach ------ T.C=O(n), S.C=O(n)
        /*int n = gas.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int currPetrol = 0;
        int i = 0;
        int count = 0;

        while(i < n ){
            dq.add(i);
            currPetrol += (gas[i]-cost[i]);
            if(currPetrol < 0){
                count++;
            }
            if(count == n){
                return -1;
            }
            while(currPetrol < 0 && !dq.isEmpty()){
                int j = dq.removeFirst();
                currPetrol -= (gas[j]-cost[j]);
            }
            i = (i+1)%n;
            if(!dq.isEmpty() && dq.peekFirst()==i){
                return i;
            }
        }

        return -1;*/

        // --------- Optimal Approach ------ T.C = O(n), S.C = O(1)
        int start = 0;
        int currPetrol = 0;
        int prevPetrol = 0;
        for(int i=0;i<gas.length;i++){
            currPetrol += (gas[i]-cost[i]);
            if(currPetrol < 0){
                start = i+1;
                prevPetrol += currPetrol;
                currPetrol = 0;
            }
        }
        if(currPetrol + prevPetrol >= 0){
            return start;
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

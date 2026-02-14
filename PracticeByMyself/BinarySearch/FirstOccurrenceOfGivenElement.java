package PracticeByMyself.BinarySearch;

public class FirstOccurrenceOfGivenElement {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6};
        int target = 2;
        int start = 0;
        int end = arr.length - 1;
        int firstIndex = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                firstIndex = mid;   // store answer
                end = mid - 1;      // move left
            }

            else if(target > arr[mid]){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }

        }

        if(firstIndex != -1){
            System.out.println("First occurrence index is: " + firstIndex);
        }
        else{
            System.out.println("Element not found");
        }

    }
}

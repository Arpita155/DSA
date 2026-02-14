package PracticeByMyself.BinarySearch;

public class FindOutTheIndexOfATargetElement {

    public static void main(String[] args) {
        int[]arr = {1,2,3,5,7,9,11};
        int target = 9;
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                System.out.println("Target element is found at index : "+mid);
                break;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
    }
}

package LeetCode.Math.Easy;

import java.util.Scanner;

public class PerfectNumber {

    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i == 0){
                sum += i;
            }
        }
        if(sum == num){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Is the number perfect or not : "+checkPerfectNumber(n));
    }
}

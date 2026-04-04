package LeetCode.String.Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                res.add("FizzBuzz");
            }else if(i % 3 == 0){
                res.add("Fizz");
            }else if(i % 5 == 0){
                res.add("Buzz");
            }else{
                String number = Integer.toString(i);
                res.add(number);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));    // [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
    }
}

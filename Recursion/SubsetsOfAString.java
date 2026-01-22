package Recursion;

public class SubsetsOfAString {

    public static void subset(String str, String r, int counter){    //T.C = O(2^n)  S.C = O(n)
        if(counter==str.length()){
            System.out.println(r);
            return;
        }
        subset(str,r,counter+1);
        subset(str,r+str.charAt(counter),counter+1);
    }

    public static void main(String[] args) {
        String str = "ABC";
        subset(str,"",0);    // C,B,BC,A,AC,AB,ABC
    }
}

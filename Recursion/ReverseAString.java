package Recursion;

public class ReverseAString {

    public static String reverse(String s){
        if(s.isEmpty()){
            return s;
        }

        return reverse(s.substring(1))+ s.charAt(0);
    }

    public static void main(String[] args) {
        String str = "arpita";
        String rev = reverse(str);
        System.out.println("Reverse of the string is : "+reverse(str));
    }
}

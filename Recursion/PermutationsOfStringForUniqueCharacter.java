package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfStringForUniqueCharacter {

    public static void permutationOfString(List<String> res,String str, ArrayList<Character> al, boolean []track,String result){
        if(al.size() == str.length()){
            res.add(result);
//            System.out.println(result);
            return;
        }

        for(int i=0;i<str.length();i++){
            if(!track[i]){
                al.add(str.charAt(i));
                track[i]=true;
                permutationOfString(res,str,al,track,result+str.charAt(i));
                al.remove(al.size()-1);
                track[i]=false;
            }
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        boolean[]track = new boolean[str.length()];
        ArrayList<Character> al = new ArrayList<>();
        List<String> res = new ArrayList<>();
        permutationOfString(res,str,al,track,"");
        System.out.println(res);
    }
}

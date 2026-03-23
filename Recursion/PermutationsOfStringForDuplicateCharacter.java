package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfStringForDuplicateCharacter {

    public static void permutationOfString(List<String> res, String str, ArrayList<Character> al, boolean []track, String result){
        if(al.size() == str.length()){
            res.add(result);
            return;
        }
        for(int i=0;i<str.length();i++){
            if(i>0 && str.charAt(i)==str.charAt(i-1) && !track[i-1]){
                continue;
            }
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
        String str = "ABAC";    // [AABC, AACB, ABAC, ABCA, ACAB, ACBA, BAAC, BACA, BCAA, CAAB, CABA, CBAA]
        boolean[]track = new boolean[str.length()];
        ArrayList<Character> al = new ArrayList<>();
        List<String> res = new ArrayList<>();
        char []ca = str.toCharArray();
        Arrays.sort(ca);
        String s = new String(ca);
        permutationOfString(res,s,al,track,"");
        System.out.println(res);
    }
}

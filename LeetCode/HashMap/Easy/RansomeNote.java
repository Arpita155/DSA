package LeetCode.HashMap.Easy;

import java.util.HashMap;

public class RansomeNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : ransomNote.toCharArray()){
            if(map.containsKey(ch) && map.get(ch)>0){
                map.put(ch,map.getOrDefault(ch,0)-1);
            }else{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
}

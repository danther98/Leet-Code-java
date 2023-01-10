import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Given an array of strings strs, group the anagrams together. 
You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
 */





public class groupAnagrams {
    public static void main(String[] args) {
       String[] strs0 = {"eat","tea","tan","ate","nat","bat"};
       String[] strs1 = {""};
       String[] strs2 = {"a"};
       System.out.println(groupAnagramsTogether(strs0));
       System.out.println(groupAnagramsTogether(strs1));
       System.out.println(groupAnagramsTogether(strs2));


    }
    //Accepts: String[]
    //Returns: List<List<String>>

    public static List<List<String>> groupAnagramsTogether(String[] strs) {
        List<List<String>> res = new ArrayList<>(); //creating list to store list of char and count
        if(strs.length==0){
            return res;
 
        }
        HashMap<String,List<String>> map = new HashMap<>(); //K: String, V: list of char and count
        for(String s: strs){
            char[] hash= new char[26];
             for(Character c : s.toCharArray()){
                 hash[c-'a']++; //setting "a" -> 0, "b" -> 1, etc...
             }
         String key = new String(hash);
         map.computeIfAbsent(key,k->new ArrayList<>());
         map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
     }

}

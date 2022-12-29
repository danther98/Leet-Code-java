import java.util.Arrays;
import java.util.HashMap;

import javax.lang.model.util.ElementScanner14;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
//typically using all the original letters exactly once.

class solution2 {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        String s1 = "rat";
        String t1 = "car";
        System.out.println(anagram(s, t));
    }

    public static boolean anagram(String s1, String s2) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();//using hashp map to store characters and number of times 
        HashMap<Character, Integer> charCountMap2 = new HashMap<Character, Integer>();
        char[] s1A = s1.toCharArray();
        char[] s2A = s2.toCharArray();

        for (char c : s1A) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);

            } else {
                charCountMap.put(c, 1);

            }
        }

        for (char c : s2A) {
            if (charCountMap2.containsKey(c)) {
                charCountMap2.put(c, charCountMap2.get(c) + 1);

            } else {
                charCountMap2.put(c, 1);

            }
        }

        for (int i = 0; i < charCountMap.size(); i++) {
            if (charCountMap.equals(charCountMap2)) {
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

}

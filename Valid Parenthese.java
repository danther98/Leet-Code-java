import java.util.HashMap;
import java.util.Stack;

import javax.lang.model.util.ElementScanner14;

/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

 */

class Solution {

    public static void main(String[] args) {
        String s1 = "]";
        System.out.println(isValid(s1));

    }

    static public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();//creating hashmap to check characters
        Stack<Character> stack = new Stack<Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        char[] sArray = s.toCharArray();
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] == '(') {
                stack.push(sArray[i]);
            } else if (sArray[i] == '[') {
                stack.push(sArray[i]);
            } else if (sArray[i] == '{') {
                stack.push(sArray[i]);
            }else if (map.containsKey(sArray[i])) { // checking if closing key 
                if(stack.empty()){
                    return false; 
                }
                if (stack.peek() == (map.get(sArray[i]))) { //checking top of stack against map values
                    stack.pop();
                }else {
                    return false;
                }
            }
        }        
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    
    
}
}
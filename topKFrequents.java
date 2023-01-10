import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

class Solution3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = new int[6];
        nums[0] = 3;
        nums[1] = 7;
        nums[2] = 9;
        nums[3] = 7;
        nums[4] = 2;
        nums[5] = 7;
        int k = 2;
        int[] rNum=new int[k];
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], 0);
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            if(i<k){
                rNum[i]=map.get(nums[i]);
                Arrays.sort(rNum);    
            }

        }
    

         for (Entry<Integer, Integer> m : map.entrySet()) {
            
             System.out.println("Key: " + m.getKey() + " Val: " + m.getValue() + "");
        
           
             
        } 
        for(int r =rNum.length-1; r>0; r--){
            System.out.println(rNum[r]);
        }
    }
       

          
            
            

            

        
       
        
    }


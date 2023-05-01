import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) { 
        int j = 0;
        for (int i = 0; i < s.length(); i++){ // Loops through string
            char c = s.charAt(i);
            Map<Integer, String> sDic = new HashMap<Integer, String>();
            if (sDic.containsValue(c) == true) {
                continue;
            } else {
                sDic.put(j, c);


            }



            
        }

        return true;
    }
}
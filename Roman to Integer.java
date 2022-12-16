import java.io.*;
import java.util.*;
class solution {
    public int romanToInt(String s) {
        int answer = 0;
        char current;
        char nextone;
        int currentvalue;
        int nextvalue;
        boolean anomaly = false;
        char[] numerals = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        char[] innumerals = s.toCharArray();
        for (int i=0; i < s.length(); i++) {
            if (anomaly == true) {
                continue;
            } else {
                 
            }
            
        }



        return answer;
    }
}
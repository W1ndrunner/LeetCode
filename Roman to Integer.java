import java.io.*;
import java.util.*;
class solution {
    public int romanToInt(String s) {
        int answer = 0;
        char current;
        char nextone;
        int currentvalue = 0;
        int nextvalue = 0;
        int j;
        boolean anomaly = false;
        char[] numerals = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        // char[] innumerals = s.toCharArray(); Turns String into an array of chars
        for (int i=0; i < s.length(); i++) {// Cycles through chars in String
            j = 0; 
            if (anomaly == true) {
                anomaly = false;
                nextvalue = 0;
                continue;
            } else {
                current = s.charAt(i);
                 for (j = 0; j < numerals.length; j++) { // Cycles through Numerals array
                    if (s.charAt(i) == numerals[j]) {
                        currentvalue = values[j];
                    }
                    if ((i+1) < s.length()) {
                        if (s.charAt(i+1) == numerals[j])  {
                        nextvalue = values[j];
                        }
                    }


                 }
                 
                 if ( currentvalue < nextvalue) {
                    answer += (nextvalue - currentvalue);
                    anomaly = true;
                 } else{
                    answer += currentvalue;
                 }
            }
            
        }



        return answer;
    }
}
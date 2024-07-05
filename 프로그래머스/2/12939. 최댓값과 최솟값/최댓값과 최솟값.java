import java.util.*;

class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        int min, max, n;
        
        min = max = Integer.parseInt(num[0]);
        
        for(int i = 1; i < num.length; i++){
            n = Integer.parseInt(num[i]);
            if(n < min) min = n;
            if(n > max) max = n;
        }
        
        return min + " " + max;
    }
}
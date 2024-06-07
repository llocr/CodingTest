import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<10; i++) {
            s = s.replaceAll(str[i],num[i]);
        }
        
        return Integer.parseInt(s);
    }
}
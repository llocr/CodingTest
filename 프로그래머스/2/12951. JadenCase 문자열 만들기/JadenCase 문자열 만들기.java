import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        
        for(int i = 0; i < str.length; i++) {
            String now = str[i];
            
            if(str[i].length() == 0) {
                answer += " ";
            } else {
                answer += now.substring(0,1).toUpperCase();
                answer += now.substring(1, now.length()).toLowerCase();
                answer += " ";
            }
        }
        
        if(s.substring(s.length()-1, s.length()).equals(" ")){
    		return answer;
        }
        
        return answer.substring(0, answer.length()-1);
    }
}
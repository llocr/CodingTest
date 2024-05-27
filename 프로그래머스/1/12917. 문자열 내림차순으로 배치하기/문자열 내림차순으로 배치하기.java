import java.util.*;

class Solution {
    public String solution(String s) {        
        int length = s.length();
        Queue<Character> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i<length; i++) {
            queue.add(s.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<length; i++) {
            sb.append(queue.poll());
        }
        
        return sb.toString();
    }
}
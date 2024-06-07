import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        Queue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char first = s1.charAt(n);
                char second = s2.charAt(n);
                
                if(first-second == 0) return s1.compareTo(s2);
                
                return first-second;
            }
        });
        
        for(int i = 0; i<strings.length; i++) {
            pq.offer(strings[i]);
        }
        
        for(int i = 0; i<strings.length; i++) {
            answer[i] = pq.poll();
        }
        
        return answer;
    }
}
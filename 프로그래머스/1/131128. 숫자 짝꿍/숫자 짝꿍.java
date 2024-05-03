import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<X.length(); i++) {
            int now = X.charAt(i) - '0';
            map.put(now, map.getOrDefault(now, 0) + 1);
        }
        
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        boolean zeroCheck = false;
        
        for(int i = 0; i<Y.length(); i++) {
            int now = Y.charAt(i) - '0';
            
            if(map.containsKey(now) && map.get(now) > 0) {
                if(now != 0) zeroCheck = true;
                queue.add(now);
                map.put(now, map.get(now) - 1);
            }
        }
        
        if(queue.size() == 0 ) {
            sb.append(-1);
        } else if(zeroCheck) {
            while(queue.size() > 0) {
                sb.append(queue.poll());
            } 
        } else {
            sb.append(0);
        }
        
        return sb.toString();
        
    }
}
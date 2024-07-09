import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        
        List<String> caches = new LinkedList<>();
        
        for(int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            if(!caches.contains(city)) {
                answer += 5;
                if(caches.size() >= cacheSize) {
                    caches.remove(0);
                }
                caches.add(city);
                continue;
            } else {
                caches.remove(city);
                caches.add(city);
                answer += 1;
            }
        }
        
        return answer;
    }
}
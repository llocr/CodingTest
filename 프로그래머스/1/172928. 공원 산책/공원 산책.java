import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};
        int h = park.length;
        int w = park[0].length();
        
        char[][] parks = new char[h][w];
        
        for(int i = 0; i<h; i++) {
            for(int j = 0; j<w; j++) {
                parks[i][j] = park[i].charAt(j);
                
                if(parks[i][j] == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                } 
            }
        }
        
        int[] dh = {-1, 0, 1, 0};
        int[] dw = {0, 1, 0, -1};
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('N', 0);
        map.put('E', 1);
        map.put('S', 2);
        map.put('W', 3);
        
        for(int i = 0; i<routes.length; i++) {
            char direction = routes[i].charAt(0);
            int value = Integer.parseInt(routes[i].substring(2, routes[i].length()));
            
            int index = map.get(direction);
            
            int nh = answer[0] + (dh[index] * value);
            int nw = answer[1] + (dw[index] * value);
            
            if(nh >= h || nh < 0 || nw >= w || nw < 0) continue;
            
            boolean check = true;
            
            int tempH = answer[0];
            int tempW = answer[1];
            
            for(int j = 0; j<value; j++) {
                tempH += dh[index];
                tempW += dw[index];
                
                if(parks[tempH][tempW] == 'X') {
                    check = false;
                    break;
                }
            }
            
            if(check) {
                answer[0] = nh;
                answer[1] = nw;
            }
        }

        return answer;
    }
}
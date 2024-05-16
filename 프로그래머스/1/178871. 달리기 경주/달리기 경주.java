import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for(String player : callings) {
            int ranking = map.get(player);
            String temp = players[ranking-1];
            players[ranking-1] = player;
            players[ranking] = temp;
            
            map.put(player, ranking-1);
            map.put(temp, ranking);
        }
        
        return players;
    }
}
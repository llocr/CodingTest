import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Set<Integer> lostList = new HashSet<>();
        ArrayList<Integer> reserveList = new ArrayList<>();
        
        for(int i = 0; i<lost.length; i++) {
            lostList.add(lost[i]);
        }
        
        for(int i = 0; i<reserve.length; i++) {
            reserveList.add(reserve[i]);
        }
        
        Collections.sort(reserveList);
        
        ArrayList<Integer> remove = new ArrayList<>();
        
        for (int num : lostList) {
            if (reserveList.contains(num)) {
                remove.add(num);
            }
        }
        
        lostList.removeAll(remove);
        reserveList.removeAll(remove);
        
        int answer = n - lostList.size();
        
        for(int i = 0; i<reserveList.size(); i++) {
            int now = reserveList.get(i);
            
            if(lostList.contains(now-1)) {
                lostList.remove(now-1);
                answer ++;
            } else if(lostList.contains(now+1)) {
                lostList.remove(now+1);
                answer ++;
            }
        }
        
        return answer;
    }
}
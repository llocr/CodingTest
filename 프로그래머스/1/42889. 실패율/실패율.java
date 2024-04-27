import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double all = (double) stages.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Double> fail = new HashMap<>();
                
        for(int i = 0; i<stages.length; i++) {
            map.put(stages[i], map.getOrDefault(stages[i], 0)+1);
        }
        
        for(int i = 1; i<= N; i++) {
            if(map.containsKey(i)) {
                double people = map.get(i);
                double failRate = people / all;
                fail.put(i, failRate);
                all -= people;
            } else {
                fail.put(i, 0.0);
            }
        }
        
        List<Integer> sortStages = new ArrayList<>(fail.keySet());
        Collections.sort(sortStages, (s1, s2) -> fail.get(s2).compareTo(fail.get(s1)));
        
        for(int i = 0; i < N; i++){
            answer[i] = sortStages.get(i);
        }
        
        return answer;
    }
}
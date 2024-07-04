import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> daysQueue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remaining = 100 - progresses[i];
            int days = (remaining % speeds[i] == 0) ? (remaining / speeds[i]) : (remaining / speeds[i] + 1);
            daysQueue.add(days);
        }
        
        List<Integer> result = new ArrayList<>();
        
        while (!daysQueue.isEmpty()) {
            int currentDay = daysQueue.poll();
            int count = 1;
            
            while (!daysQueue.isEmpty() && daysQueue.peek() <= currentDay) {
                daysQueue.poll();
                count++;
            }
            
            result.add(count);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}
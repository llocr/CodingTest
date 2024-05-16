import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Queue<Integer> queue = new PriorityQueue<>();
        
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                queue.offer(arr[i]);
            }
        }
        
        if (queue.isEmpty()) {
            return new int[] {-1};  
        }
        
        int[] answer = new int[queue.size()];
        int index = 0;
        
        while(!queue.isEmpty() || index < answer.length) {
            answer[index] = queue.poll();
            index++;
        }
        
        return answer;
    }
}
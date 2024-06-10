import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i<commands.length; i++) {
            int n = commands[i][0];
            int j = commands[i][1];
            int k = commands[i][2];
            
            int[] arr = new int[j - n + 1];
            
            for(int l = 0; l<arr.length; l++) {
                arr[l] = array[n + l - 1];
            }
            
            Arrays.sort(arr);
            
            answer[i] = arr[k-1];
        }
        
        return answer;
    }
}
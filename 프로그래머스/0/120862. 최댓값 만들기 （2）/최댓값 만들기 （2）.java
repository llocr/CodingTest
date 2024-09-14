import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0] * numbers[1];
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                max = Math.max(max, numbers[i] * numbers[j]);
            }
        }
        
        return max;
    }
}
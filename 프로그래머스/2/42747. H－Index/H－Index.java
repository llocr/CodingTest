import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int n = citations.length;
        int answer = 0;
        
        Arrays.sort(citations);
        
        for(int i = n; i > 0; i--) {
            int temp = 0;
            for(int j = n-1; j >= 0; j--) {
                if (citations[j] >= i) temp++;
                else break;
            }
            
            if (temp >= i) {
                answer = i;
                break;
            }
        }
        
        
        return answer;
    }
}
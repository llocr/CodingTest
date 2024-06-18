import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length;
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        boolean check = true;
        
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    
                    for(int l = 2; l <= Math.sqrt(num); l++) {
                        if(num % l == 0) {
                            check = false;
                            break;
                        }
                    }
                
                    if(check) {
                        answer++;
                    }
                    
                    check = true;
                }
            }
        }
        
        return answer;
    }
}

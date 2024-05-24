class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i<right+1; i++) {
            int count = 0;
            
            for(int j=1; j*j <= i; j++) {
                if(i % 2 == 0) count += 2;
                if(j*j == i) count -= 1;
            }
            
            if(count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
}
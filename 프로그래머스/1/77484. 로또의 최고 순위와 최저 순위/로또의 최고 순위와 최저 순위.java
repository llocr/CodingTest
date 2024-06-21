class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int right = 0;
        int dontKnow = 0;
        
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i] == 0) {
                dontKnow++;
            } else {
                for(int j=0; j<win_nums.length; j++) {
                    if(lottos[i] == win_nums[j]) {
                        right++;
                        break;
                    }
                }
            }
        }
        
        int maxRank = 7 - (right + dontKnow);
        int minRank = 7 - right;
        
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;
        
        return new int[] {maxRank, minRank};
    }
}
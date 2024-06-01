class Solution
{
    public int solution(int n, int a, int b) {
        int answer = 0;
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        
        boolean check = false;
        
        while(!check) {            
            if(big % 2 == 0 && big == small + 1) {
                check = true;
            }
            
            n = n / 2;
            
            big = nextRound(big);
            small = nextRound(small);
            
            answer++;
        }
        
        return answer;
    }
    
    public int nextRound (int n) {
        if(n % 2 == 0) {
            return n / 2;
        } else {
            return n / 2 + 1;
        }
    }
}
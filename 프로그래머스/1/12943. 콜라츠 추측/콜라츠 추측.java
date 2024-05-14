class Solution {
    public int solution(int num) {
        int answer = collatz(num, 0);
        return answer;
    }
    
    public int collatz(long n, int sum) {
        if(sum >= 500) return -1;
        
        if(n == 1) {
            return sum;
        } else if(n % 2 == 0) {
            n = n / 2;
            sum++;
            return collatz(n, sum);
        } else {
            n = (n * 3) + 1;
            sum++;
            return collatz(n, sum);
        }
    }
}
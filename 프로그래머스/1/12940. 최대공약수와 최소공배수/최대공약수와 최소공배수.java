class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
                
        int max = (m > n ? m : n);
        int min = (m > n ? n : m);

        answer[0] = gcd(max, min);
        answer[1] = lcm(max, min, answer[0]);
        
        return answer;
    }
    
    //최대 공약수 구하기
    public int gcd (int n, int m) {
        if(m == 0) return n;
        return gcd(m, n % m);
    }
    
    //최소 공배수 구하기
    public int lcm (int n, int m, int l) {
        return n * m / l;
    }
}
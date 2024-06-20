class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] arr = new int[number+1];
        
        for(int i = 1; i<= number; i++) {
            for(int j = 1; j<= Math.sqrt(i); j++) {
                if(j*j == i) arr[i]++;
                else if(i % j == 0) arr[i] += 2; 
            }
            if(arr[i] > limit) arr[i] = power;
        }
        
        for(int i = 1; i<=number; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}
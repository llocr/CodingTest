class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        
        char x = arr[0];
        int xCount = 0;
        int count = 0;
        
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] != x) count++;
            else xCount++;
            
            if(xCount == count || i == arr.length - 1) {
                answer++;
                if(i+1 < arr.length) {
                    x = arr[i+1];
                    xCount = 0;
                    count = 0; 
                }
            }
        }
        
        return answer;
    }
}
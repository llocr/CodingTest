import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        Integer[] arr = new Integer[str.length()];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i = 0; i<str.length(); i++) {
            sb.append(arr[i]);
        }
        
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}
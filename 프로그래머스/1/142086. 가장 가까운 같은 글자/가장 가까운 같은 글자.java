import java.util.*;

class Solution {
    public int[] solution(String s) {
        ArrayList<Integer>[] arr = new ArrayList[26];
        int[] answer = new int[s.length()];
        
        for(int i = 0; i<s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if(arr[index] == null) {
                arr[index] = new ArrayList<>();
                arr[index].add(i);
                answer[i] = -1;
            } else {
                answer[i] = i - arr[index].get(arr[index].size() - 1);
                arr[index].add(i);
            }
        }
        
        return answer;
    }
}
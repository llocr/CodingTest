class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while (!s.equals("1")) {
            answer[0]++;
            int before = s.length();
            s = s.replaceAll("0", "");
            int after = s.length();
            answer[1] += before - after;
    
            long length = after;
            s = Long.toBinaryString(length);
        }
        
        return answer;
    }
}
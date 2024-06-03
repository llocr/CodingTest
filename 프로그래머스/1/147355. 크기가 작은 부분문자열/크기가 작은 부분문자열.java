class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long a = Long.parseLong(p);
        int length = p.length();
        
        for(int i = 0; i<=t.length()-length; i++) {
            long temp = Long.parseLong(t.substring(i, i + length));
            System.out.println(temp);
            if(temp <= a) answer++;
        }
        
        return answer;
    }
}
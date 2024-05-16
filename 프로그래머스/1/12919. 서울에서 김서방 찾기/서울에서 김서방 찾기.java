class Solution {
    public String solution(String[] seoul) {
        int n = 0;
        for(int i=0; i<seoul.length; i++) {
            if("Kim".equals(seoul[i])) {
                n = i;
                break;
            }
        }
        
        String answer = "김서방은 " + n + "에 있다";
        return answer;
    }
}
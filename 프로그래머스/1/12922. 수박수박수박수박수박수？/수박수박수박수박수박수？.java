class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<n/2; i++) {
            sb.append("수박");
        }
        
        if(n % 2 != 0) {
            sb.append("수");
        }    
            
        return sb.toString();
    }
}
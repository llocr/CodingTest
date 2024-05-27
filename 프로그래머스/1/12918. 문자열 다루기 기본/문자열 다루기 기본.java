class Solution {
    public boolean solution(String s) {
        char[] c = s.toCharArray(); 
        
        if(c.length != 4 && c.length != 6) return false;
        
        for(int i = 0; i<s.length(); i++) {
            if(c[i] - '0' > 9 || c[i] - '0' < 0) return false;
        }
        
        return true;
    }
}
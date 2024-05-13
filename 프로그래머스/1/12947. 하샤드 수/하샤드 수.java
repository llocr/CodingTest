class Solution {
    public boolean solution(int x) {
        String str = Integer.toString(x);
        int n = 0;
        
        for(int i = 0; i<str.length(); i++) {
            n += (str.charAt(i)) - '0';
        }
        
        if(x%n == 0) {
            return true;
        } else {
            return false;
        }
    }
}
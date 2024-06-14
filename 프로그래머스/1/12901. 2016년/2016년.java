class Solution {
    public String solution(int a, int b) {
        String[] result = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int days = 0;
        
        if(a < 9) {
            days += 31 * (a/2);
            if(a % 2 == 0) {
                days += 30 * (a/2 - 1);
            } else {
                days += 30 * (a/2);
            }
        } else {
            days += 30 * (a/2 - 1);
            if(a % 2 == 0 ) {
                days += 31 * (a/2);
                
            } else {
                days += 31 * (a/2 + 1);
            }
        }
        
        if(a > 2) days -=  1;
        
        days += b;
        
        return result[days%7];
    }
}
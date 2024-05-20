class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int size = phone_number.length();
        
        for(int i = 0; i<size-4; i++) {
            sb.append("*");
        }
        
        sb.append(phone_number.substring(size-4, size));
        
        return sb.toString();
    }
}
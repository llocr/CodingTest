class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        
        int temp = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') {
                temp = 0;
                sb.append(" ");
                continue;
            } else if(temp % 2 == 1) {
                sb.append(Character.toLowerCase(arr[i]));
            } else {
                sb.append(Character.toUpperCase(arr[i]));
            }
            temp++;
        }
        
        return sb.toString();
    }
}
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {
            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);
            
            int a = binary1.length();
            int b = binary2.length();
            
            
            for(int k = a; k<n; k++) {
                binary1 = "0" + binary1;
            }
            
            for(int k = b; k<n; k++) {
                binary2 = "0" + binary2;
            }
            
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j<n; j++){
                if(binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }

        return answer;
    }
}
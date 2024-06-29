class Solution {
    public String solution(String[] survey, int[] choices) {
        char[] c = new char[]{'R','T','C','F','J','M','A','N'};
        StringBuilder answer = new StringBuilder();
        int[] scores = new int[8];
        
        
        for(int i = 0; i<survey.length; i++){
            char a = survey[i].charAt(1);
            int n = 0;
            
            switch(a) {
                case 'R' : n = 0; break;
                case 'T' : n = 1; break;
                case 'C' : n = 2; break;
                case 'F' : n = 3; break;
                case 'J' : n = 4; break;
                case 'M' : n = 5; break;
                case 'A' : n = 6; break;
                case 'N' : n = 7; break;
            }
            
            int point = Math.abs(choices[i] - 4);
            
            if((choices[i] - 4) > 0) {
                scores[n] += point;
            } else if((choices[i] - 4) < 0) {
                if(n%2 == 0) {
                    scores[n+1] += point;
                } else {
                    scores[n-1] += point;
                }
            }
            
        }
        
        for(int i = 0; i<8; i+=2) {
            if(scores[i] > scores[i+1] || scores[i] == scores[i+1]) {
                answer.append(c[i]);
            } else if(scores[i] < scores[i+1]) {
                answer.append(c[i+1]);
            }
        } 
        
        return answer.toString();
    }
}
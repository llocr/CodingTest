class Solution {
    public int solution(String dartResult) {
        
        int[] answer = new int[3];
        int index = -1;
            
        String number = "";
        
        for(int i = 0; i<dartResult.length(); i++) {
            char now = dartResult.charAt(i);
            
            if(Character.isDigit(now)) {
                number += now;
            } else if(now == 'S' || now == 'D' || now == 'T') {
                index++;
                int temp = Integer.parseInt(number);
            
                switch(now) {
                    case 'D' :
                        temp = temp * temp;
                        break;
                    case 'T' :
                        temp = temp * temp * temp;
                }
                
                answer[index] = temp;
                number = "";
                
            } else if (now == '*' || now == '#') {
                switch(now) {
                    case '*' :
                        if(index == 0) {
                            answer[index] *= 2;
                        } else {
                            answer[index - 1] *= 2;
                            answer[index] *= 2;
                        }
                        break;
                    case '#' :
                        answer[index] *= -1;
                }
            }
        }
        
        int total = 0;
        
        for(int i = 0; i<answer.length; i++) {
            total += answer[i];
        }
        
        return total;
    }
}
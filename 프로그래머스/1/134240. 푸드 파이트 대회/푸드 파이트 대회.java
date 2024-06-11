class Solution {
    public String solution(int[] food) {
        StringBuilder answer =  new StringBuilder();
        int n = food.length;
        
        for(int i=1; i<n; i++) {
            if(food[i]%2 != 0){
                food[i]--;
            }
            for (int j = 1; j <= food[i] / 2; j++) {
                answer.append(i);
            }
        }
            
        answer.append(0);
            
        for(int i=n-1; i>0; i--) {
            for (int j = 1; j <= food[i] / 2; j++) {
                answer.append(i);
            }
        }
        
        return answer.toString();
    }
}
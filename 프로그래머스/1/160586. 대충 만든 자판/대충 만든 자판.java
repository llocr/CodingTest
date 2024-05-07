class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i = 0; i<targets.length; i++) {
            String target = targets[i];
            int totalPress = 0;
            
            for(char c : target.toCharArray()) {
                boolean found = false;
                int minPress = Integer.MAX_VALUE;
                
                for(String key : keymap) {
                    int press = key.indexOf(c);
                    if(press != -1) {
                        minPress = Math.min(minPress, press + 1); 
                        found = true;
                    } 
                }
                
                if(!found) {
                    totalPress = -1;
                    break;
                }
                
                totalPress += minPress;
            }
            
            answer[i] = totalPress;
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int all = brown + yellow;
        
        for (int height = 3; height <= all / height; height++) {
            if (all % height == 0) {
                int width = all / height;
                int brownCount = (width * 2) + (height * 2) - 4;
                int yellowCount = all - brownCount;
                
                if (brownCount == brown && yellowCount == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}
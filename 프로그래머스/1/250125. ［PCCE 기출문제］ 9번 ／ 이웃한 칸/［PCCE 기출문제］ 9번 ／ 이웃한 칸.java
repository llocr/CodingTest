class Solution {
    public int solution(String[][] board, int h, int w) {
        int[] dh = {0, -1, 0, 1};
        int[] dw = {1, 0, -1, 0};
        int answer = 0;
        int n = board.length;
        String color = board[h][w];
        
        for(int i = 0; i<4; i++) {
            int nexth = h + dh[i];
            int nextw = w + dw[i];
            
            if(nexth >= 0 && nexth < n && nextw >= 0 && nextw < n) {
                if(color.equals(board[nexth][nextw])){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
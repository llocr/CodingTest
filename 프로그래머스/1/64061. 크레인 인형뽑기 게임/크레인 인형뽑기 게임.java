import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
        for(int i = 0; i<moves.length; i++) {
            int now = moves[i] - 1;
            int find = 0;
            
            for(int j = 0; j<board.length; j++) {
                if(board[j][now] != 0) {
                    find = board[j][now];
                    board[j][now] = 0;
                    
                    if(!stack.isEmpty() && find == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(find);
                    }
                    
                    break;
                }
            }
        }
        
        return answer;
    }
}
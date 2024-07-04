import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        boolean[][] check = new boolean[id_list.length][id_list.length];
        int[] answer = new int[id_list.length];
        int[] warning = new int[id_list.length];
        
        for(int i = 0; i<report.length; i++) {
            String[] user = report[i].split(" ");
            int user1 = Arrays.asList(id_list).indexOf(user[0]);
            int user2 = Arrays.asList(id_list).indexOf(user[1]);
            
            if(!check[user1][user2]) {
                check[user1][user2] = true;
                warning[user2] = warning[user2] + 1;
            }
        }
        
        for(int i = 0; i<id_list.length; i++) {
            if(warning[i] >= k) {
                for(int j = 0; j<id_list.length; j++) {
                    if(check[j][i] == true) {
                        answer[j] = answer[j] + 1;
                    }
                }
                
            }
        }
        
        return answer;
    }
}
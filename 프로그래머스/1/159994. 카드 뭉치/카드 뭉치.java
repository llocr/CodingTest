import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        boolean check = true;
        
        for(int i = 0; i<cards1.length; i++) {
            queue1.add(cards1[i]);
        }
        
        for(int i = 0; i<cards2.length; i++) {
            queue2.add(cards2[i]);
        }
        
        for(int i = 0; i<goal.length; i++) {
            String a = queue1.peek();
            String b = queue2.peek();
            
            if(goal[i].equals(a)) {
                queue1.poll();
            } else if (goal[i].equals(b)) {
                queue2.poll();
            } else {
                check = false;
                break;
            }
        }
        
        
        return check ? "Yes" : "No";
    }
}
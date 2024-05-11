import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int now = Integer.parseInt(today.replace(".", ""));
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i<terms.length; i++) {
            String type = terms[i].substring(0, 1);
            int month = Integer.parseInt(terms[i].substring(2, terms[i].length()));
            map.put(type, month);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<privacies.length; i++) {
            int date = Integer.parseInt(privacies[i].substring(0, 10).replace(".", ""));
            String type = privacies[i].substring(privacies[i].length() - 1, privacies[i].length());
            
            int year = map.get(type) / 12;
            int month = map.get(type) % 12;
            
            date += 10000 * year;
            date += 100 * month;
            
            int check = date - (date / 10000) * 10000;
            
            if(check >= 1300) {
                date += 10000 * (check / 1200) - 1200;
            }
            
            if(date <= now) {
                list.add(i + 1);
            }
            
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
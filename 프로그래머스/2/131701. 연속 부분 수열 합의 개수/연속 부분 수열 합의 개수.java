import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int length = elements.length;
        Set<Integer> set = new HashSet<>();
        
        int[] extendedElements = new int[length * 2];
        
        for (int i = 0; i < length; i++) {
            extendedElements[i] = elements[i];
            extendedElements[i + length] = elements[i];
        }
        
        for (int n = 1; n <= length; n++) {
            
            for (int i = 0; i < length; i++) {
                int sum = 0;
                
                for (int j = i; j < i + n; j++) {
                    sum += extendedElements[j];
                }
                
                set.add(sum);
            }
        }
        
        return set.size();
    }
}
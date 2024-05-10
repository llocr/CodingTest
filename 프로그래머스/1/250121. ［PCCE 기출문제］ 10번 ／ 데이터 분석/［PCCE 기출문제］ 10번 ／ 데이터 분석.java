import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        
        int point = -1;
        switch(ext) {
                case "code" -> point = 0;
                case "date" -> point = 1;
                case "maximum" -> point = 2;
                case "remain" -> point = 3;
        }
        
       int standard = -1;
        switch(sort_by) {
                case "code" -> standard = 0;
                case "date" -> standard = 1;
                case "maximum" -> standard = 2;
                case "remain" -> standard = 3;
        }
        
        
        for(int i = 0; i < data.length; i++) {
            if(data[i][point] < val_ext) {
                int[] temp = new int[data[i].length];
                for(int j = 0; j < data[i].length; j++) {
                    temp[j] = data[i][j];
                }
                list.add(temp);
            }
        }
        
        final int standardIndex = standard;
        Collections.sort(list, (o1, o2) -> o1[standardIndex] - o2[standardIndex]);
        
        int[][] answer = new int[list.size()][data[0].length];
        
        for(int i = 0; i < list.size(); i++) {
            int[] temp = list.get(i);
            for(int j = 0; j < data[0].length; j++) {
                answer[i][j] = temp[j];
            }
        }
        
        return answer;
    }
}
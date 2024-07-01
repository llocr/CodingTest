class Solution {
    boolean[][] visited;
    String[][] copy;
    boolean[] x;
    boolean[] y;
    
    public int[] solution(String[] wallpaper) {
        int n = wallpaper.length;
        int m = wallpaper[0].length();
        copy = new String[n][m];
        visited = new boolean[n][m];
        x = new boolean[n+1];
        y = new boolean[m+1];
        
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                copy[i][j] = wallpaper[i].substring(j,j+1);
                if(copy[i][j].equals("#")) {
                    x[i] = true;
                    x[i+1] = true;
                    y[j] = true;
                    y[j+1] = true;
                }
            }
        }
        
        int xMin = n+1;
        int xMax = 0;
        for(int i=0; i<n+1; i++) {
            if(x[i] == true) {
                if(xMin > i) {
                    xMin = i;
                } else if(xMax < i) {
                    xMax = i;
                }
            }
        }
        
        int yMin = m+1;
        int yMax = 0;
        for(int j=0; j<m+1; j++) {
            if(y[j] == true) {
                if(yMin > j) {
                    yMin = j;
                } else if(yMax < j) {
                    yMax = j;
                }
            }
        }

        int[] answer = {xMin, yMin, xMax, yMax};
        return answer;
    }
}

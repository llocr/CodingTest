class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int first = arr1.length;
        int seconde = arr1[0].length;
        int[][] answer = new int[first][seconde];
        
        for(int i = 0; i<first; i++) {
            for(int j = 0; j<seconde; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
            
    }
}
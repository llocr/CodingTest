class Solution {
    public long solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int i=0; i<sizes.length; i++) {
            int width = sizes[i][0];
            int height = sizes[i][1];
            
            if(width < height) {
                int temp = width;
                width = height;
                height = temp;
            }
            
            maxWidth = maxWidth < width ? width : maxWidth;
            maxHeight = maxHeight < height ? height : maxHeight;
        }
        
        return maxWidth*maxHeight;
    }
}
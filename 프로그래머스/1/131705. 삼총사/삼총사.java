class Solution {
    static boolean[] check;
    static int answer = 0;
    static int length;
    static int[] arr;
    
    public int solution(int[] number) {
        arr = number;
        length = number.length;
        check = new boolean[length];
        dfs(0, 0, 0);
        return answer;
    }
    
    public void dfs(int depth, int index, int sum) {
        if(depth == 3) {
            if(sum == 0) answer++;
            return;
        } 
        for(int i = index; i<length; i++) {
            if(check[i]) continue;
            check[i]=true;
            dfs(depth+1,i+1,sum+arr[i]);
            check[i]=false;
        }            
    }
}
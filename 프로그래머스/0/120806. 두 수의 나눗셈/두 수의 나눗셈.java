class Solution {
    public int solution(int num1, int num2) {
        double answer = (double)num1 / (double)num2;
        answer = answer * 1000.0;
        
        return (int) answer;
    }
}
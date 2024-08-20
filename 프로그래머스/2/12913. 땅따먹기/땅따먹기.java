class Solution {
    int solution(int[][] land) {
		// DP 방식으로 진행
		// 이전 행에 다른 열들 중 가장 큰 값을 더해줌
        for(int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
        }

        int answer = 0;
		// 마지막 행의 최댓값을 구해서 answer에 저장
        for(int i = 0; i < 4; i++) {
            answer = Math.max(answer, land[land.length-1][i]);
        }
        
        return answer;
    }
}
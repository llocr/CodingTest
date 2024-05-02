import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   //물품의 수
        int k = Integer.parseInt(st.nextToken());   //준서가 버틸 수 있는 무게
        int[][] dp = new int[n+1][k+1];
        Bag[] bags = new Bag[n+1];

        for(int i = 1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bags[i] = new Bag(a, b);
        }


        for(int i = 1; i<=n; i++) {
            int value = bags[i].value;
            int weight = bags[i].weight;

            for(int j = 1; j<=k; j++) {
                if(weight > j) {
                    dp[i][j] = dp[i-1][j];
                } else if (weight <= j) {
                    dp[i][j] = Math.max(dp[i-1][j], value + dp[i-1][j-weight]);
                }
            }
        }

        System.out.println(dp[n][k]);
    }

    static class Bag {
        int weight;
        int value;

        public Bag(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
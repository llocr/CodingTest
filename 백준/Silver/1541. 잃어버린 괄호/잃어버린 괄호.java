import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split("-");

        for(int i = 0; i<arr.length; i++) {
            int temp = mySum(arr[i]);
            if(i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }

        System.out.println(answer);
    }

    private static int mySum(String s) {
        int sum = 0;
        String[] str = s.split("[+]");
        for(int i = 0; i<str.length; i++) {
            sum+= Integer.parseInt(str[i]);
        }
        return sum;
    }
}

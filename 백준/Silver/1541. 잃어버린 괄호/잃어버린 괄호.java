import javax.swing.*;
import java.util.Scanner;

public class Main {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine();
        String[] arr = example.split("-");

        for(int i=0; i<arr.length; i++) {
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
        for(int i=0; i<str.length; i++){
            sum += Integer.parseInt(str[i]);
        }
        return sum;
    }
}

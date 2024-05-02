import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] arr = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        int temp = 1;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == '(') {
                stack.push(arr[i]);
                temp *= 2;
            } else if(arr[i] == '[') {
                stack.push(arr[i]);
                temp *= 3;
            } else if(arr[i] == ')') {
                if(stack.isEmpty() || stack.peek() != '(') {
                    answer = 0;
                    break;
                } else if(arr[i-1] == '(') {
                    answer += temp;
                }
                stack.pop();
                temp /= 2;
            } else if(arr[i] == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    answer = 0;
                    break;
                } else if (arr[i-1] == '[') {
                    answer += temp;
                }
                stack.pop();
                temp /= 3;
            }
        }
        if(!stack.empty()) sb.append(0).append("\n");
        else sb.append(answer).append("\n");
        System.out.println(sb);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer>[] queue = new LinkedList[101];

        for(int i = 1;i <= 100; i++) {
            queue[i] = new LinkedList<>();
        }

        Set<Integer> power = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        int arr[] = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            queue[arr[i]].add(i);
        }

        int i = 0;
        for(i=0; i<k; i++) {
            power.add(arr[i]);
            queue[arr[i]].poll();

            if(power.size()==n) {
                i++;
                break;
            }
        }

        int count = 0;
        for(; i<k; i++) {
            int num = arr[i];

            queue[num].poll();
            int index = -1;
            int max = 0;

            if(power.contains(num)) continue;
            for(int number : power) {
                if(queue[number].isEmpty()) {
                    index=number;
                    break;
                }
                if(queue[number].peek() > max) {
                    max = queue[number].peek();
                    index = number;
                }
            }
            
            power.remove(index);
            power.add(num);
            count++;
        }

        System.out.println(count);
    }
}

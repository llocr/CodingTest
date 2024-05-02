import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] a;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            String line = st.nextToken(); //10110110 -> 이런식으로 들어옴
            for(int j=0; j<m; j++){
                a[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }

        BFS(0,0);
        System.out.println(a[n-1][m-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {i,j});
        visited[i][j] = true;

        while(!queue.isEmpty()) {
            int now[] = queue.poll();
            for(int k=0; k<4; k++){ //상하좌우 탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if(x >= 0 && y >= 0 && x < n && y < m){ //배열을 넘어가면 안 되고
                    if(a[x][y]!=0 && !visited[x][y]){ //0이어서 갈 수 없거나 기방문한 곳이면 안 됨
                        //이제 갈 수 있는 곳
                        visited[x][y] = true;
                        a[x][y] = a[now[0]][now[1]] + 1; //depth를 넣어주는 것
                        queue.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}
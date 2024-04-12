package CodingTest.Baek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2178_미로탐색 {

    private static boolean visited[][];
    private static int[][] A;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int N,M;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        visited = new boolean[N][M];
        A = new int[N][M];

        for(int i = 0; i < N; i++){

            String line = sc.next();

            for(int j = 0; j < M; j++){ 
                A[i][j] = Integer.parseInt(line.substring(j,j+1));
            }

        }

        BFS(0,0);
        
    }
    private static void BFS(int i, int j) {
        
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[] {i , j});
        visited[i][j] = true;
        while (!qu.isEmpty()) {
            
            int now[] = qu.poll();

            for(int k=0; k<4; k++){

                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x>=0 && y>=0 && x<N && y<M){
                    if(A[x][y]!=0 && !visited[x][y]){
                        
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] +1;
                        qu.add(new int[] {x,y});

                    }
                }

            }

            


        }

    }
    
}

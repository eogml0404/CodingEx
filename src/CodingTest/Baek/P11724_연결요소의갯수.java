package CodingTest.Baek;

import java.util.ArrayList;
import java.util.Scanner;

public class P11724_연결요소의갯수 {

    private static boolean visited[]; 
    private static ArrayList<Integer> A[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int E = sc.nextInt();
        int cnt = 0;

        visited = new boolean[N+1];
        A = new ArrayList[N+1];

        for(int i = 1; i < N+1; i++){

            A[i] = new ArrayList<>();

        }

        for(int i = 0; i < E; i++){

            int s = sc.nextInt();
            int e = sc.nextInt();
            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;
        for(int i = 1; i < N+1; i++){

            if(!visited[i]){

                count++;
                DFS(i);

            }

        }
        System.out.println(count);

    }
    private static void DFS(int v) {
        
        if(visited[v]) return;

        visited[v] = true;

        for(int i : A[v]){

            if(!visited[i]){
                DFS(i);
            }

        }


    }
    
    
}

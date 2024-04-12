package CodingTest.Baek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Queue<Integer> qu = new LinkedList<>();

        int N = sc.nextInt();
        for(int i = 0; i < N; i++){

            qu.add(i+1);

        }

        while (qu.size()>1) {
            
            qu.poll();
            qu.add(qu.poll());
        }

        System.out.println(qu.poll());
    }
    
}

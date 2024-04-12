package CodingTest.Baek;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class p11286_절댓값힙 {
    
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> qu = new PriorityQueue<>((o1,o2) ->{

            int first = Math.abs(o1);
            int second = Math.abs(o2);

            if(first == second){
                return o1 > o2 ? 1 : -1 ;
            }
            else 
                return first - second;
        }); 

        for(int i = 0; i < N; i++){

            int A = sc.nextInt();
            if(A == 0){
                if(qu.isEmpty())
                    System.out.println("0");
                else{
                    System.out.println(qu.poll()); 
                }
            }
            else{
                qu.add(A);
            }

        }
    
    }
}

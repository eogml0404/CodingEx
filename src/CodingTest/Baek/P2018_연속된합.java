package CodingTest.Baek;

import java.util.Scanner;

public class P2018_연속된합 {
    
    public static void main(String[] args) {
        
        int start = 1;
        int end = 1;
        int cnt = 1;
        int sum = 1;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (end!= N) {
            
            if(sum == N){
                cnt++;
                end++;
                sum += end;
            }
            else if(sum > N){

                sum -= start;
                start++;

            }
            else if(sum < N){
                end++;
                sum += end;
            }
        }

        System.out.println(cnt);

    }
}

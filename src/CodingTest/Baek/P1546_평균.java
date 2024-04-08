package CodingTest.Baek;

import java.util.Scanner;

public class P1546_평균 {

    public static void main(String[] args) {
        
        //점수/M * 100으로 고침 모든값
        Scanner sc = new Scanner(System.in);
        int maxNum = 0;
        int N = sc.nextInt();
        double answer = 0.0;
        int[] score = new int[N];
        for(int i = 0 ; i < N; i++){

            score[i] = sc.nextInt();

            if(score[i]>maxNum){

                maxNum = score[i];

            }

        }
        for(int i = 0; i<score.length; i++){

            answer += (score[i]/(double)maxNum) * 100.0;

            
        }

        System.out.println(answer/N);

        sc.close();
    }
}
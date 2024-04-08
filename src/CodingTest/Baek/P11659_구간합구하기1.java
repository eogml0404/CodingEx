package CodingTest.Baek;

import java.util.Scanner;

public class P11659_구간합구하기1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A_length = sc.nextInt();
        int Qu = sc.nextInt();
        int A[] = new int[A_length+1];
        int S[] = new int[A_length+1];

        for(int i = 1; i <= A_length; i++){

            A[i] = sc.nextInt();
            
            S[i] = S[i-1] + A[i];

        }

        for(int i = 0; i < Qu; i++ ){

            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(S[b]-S[a-1]);


        }
    }
}

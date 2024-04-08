package CodingTest.Baek;

import java.util.Scanner;

public class P11720_숫자의합 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        char numArr[] = num.toCharArray();
        int answer = 0;

        for(int i = 0; i < numArr.length; i++){

            if(numArr[i]==0){
                continue;
            }
            answer += numArr[i] - '0';

        }

        System.out.println(answer);
        sc.close();
    }
}

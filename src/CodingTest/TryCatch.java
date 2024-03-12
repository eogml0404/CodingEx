package CodingTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수 3개를 입력하세요");

    int sum=0, n=0;
    for(int i=0; i<3; i++){
        System.out.print((i+1)+">>");
        try{
            n = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("정수가 아닙니다!");

            //입력 스트림에 있는 정수가 아닌 토큰을 버린다.
            sc.next();
            i--;
            continue;
        }
        sum += n;
    }
    System.out.println("합은 " + sum);

    sc.close();
   } 
}

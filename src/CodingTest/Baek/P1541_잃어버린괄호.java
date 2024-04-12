package CodingTest.Baek;

import java.util.Scanner;

public class P1541_잃어버린괄호 {
    
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String exam = sc.nextLine();
        String[] S = exam.split("[-]");

        for(int i = 0; i < S.length; i++){

            if(i==0){
                answer += mySum(S[i]);
            }
            else{
                answer -= mySum(S[i]);
            }

        }

        System.out.println(answer);
    }
    static int mySum(String s){

        int sum = 0;

        String[] StrArr = s.split("[+]");
        int[] IntArr = new int[StrArr.length];
        for(int i = 0; i<StrArr.length; i++){
            IntArr[i] = Integer.parseInt(StrArr[i]);    
            sum += IntArr[i];
        }


        return sum;
    }
}

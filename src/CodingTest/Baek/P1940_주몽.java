package CodingTest.Baek;

import java.util.Arrays;
import java.util.Scanner;

public class P1940_주몽 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int typeEA = sc.nextInt();
        int completeSum = sc.nextInt();

        int material[] = new int[typeEA]; 
        int cnt = 0;
        int start = 0;
        int end = material.length-1;

        for(int i = 0; i < material.length; i++){

            material[i] = sc.nextInt();

        }

        Arrays.sort(material);
        while (start < end) {
            
            if(material[start]+material[end] == completeSum){
                cnt++;
                end--;
                start++;
            }
            else if( material[start]+material[end] < completeSum){
                start++;
            }
            else{
                end--;
            }
        }
        System.out.println(cnt);
        sc.close();

    }

}

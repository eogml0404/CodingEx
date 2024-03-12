package CodingTest;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[10];
        for(int i=0; i<10; i++){
            intArr[i] = sc.nextInt();
        }

        int temp;

        for(int i=0; i<10; i++){
            for(int j=0; j<i; j++){
                if(intArr[j]>intArr[j+1]){
                    temp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = temp;

                }
           
            }
        }
        for(int i : intArr){
            System.out.print(i + " ");
        }
        

        sc.close();
    }
}

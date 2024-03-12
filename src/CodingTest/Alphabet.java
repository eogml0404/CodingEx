package CodingTest;

import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = str.charAt(0);
        
        for(char ch='a'; ch<=c; ch++ ){
            for(char ch2=ch; ch2<=c; ch2++){
                System.out.print(ch2);   
    
            }
            System.out.println();
        }

        sc.close();
    }
}